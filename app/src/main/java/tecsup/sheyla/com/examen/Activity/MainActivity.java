package tecsup.sheyla.com.examen.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import tecsup.sheyla.com.examen.R;
import tecsup.sheyla.com.examen.models.User;
import tecsup.sheyla.com.examen.repositories.UserRepository;

public class MainActivity extends AppCompatActivity {

Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nombre =(EditText) findViewById(R.id.nombre);
        final EditText contraseña =(EditText) findViewById(R.id.contraseña);
        final Button ingresar = (Button) findViewById(R.id.ingresar);

        registrar=(Button)findViewById(R.id.reg);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(MainActivity.this, RegistroActivity.class);
                startActivity(registrar);
            }
        });





    }
}
