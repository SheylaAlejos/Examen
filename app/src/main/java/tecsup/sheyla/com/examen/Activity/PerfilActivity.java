package tecsup.sheyla.com.examen.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import tecsup.sheyla.com.examen.R;
import tecsup.sheyla.com.examen.models.User;
import tecsup.sheyla.com.examen.repositories.UserRepository;

public class PerfilActivity extends AppCompatActivity {
    private static final String TAG = PerfilActivity.class.getSimpleName();
    private SharedPreferences sharedPreferences;
    private TextView nombreusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nombreusuario =(TextView)findViewById(R.id.fullname_text);

        //Iniciar las preferencias
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        // get username from SharedPreferences

        String usuario = sharedPreferences.getString("nombres", null);





    }
    public void callLogout(View view) {
        // remove from SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        boolean success = editor.putBoolean("islogged", false).commit();
//        boolean success = editor.clear().commit(); // not recommended
        gomail();
    }
    private void gomail(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    };
    }


