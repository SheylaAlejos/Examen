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
    private static final int REGISTER_FORM_REQUEST=100;
    private EditText usuarioInput;
    private  EditText passwordInput;
    private ProgressBar progressBar;

    Button registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioInput =(EditText) findViewById(R.id.username_input);
        passwordInput =(EditText) findViewById(R.id.password_input);
        progressBar = (ProgressBar)findViewById(R.id.progressbar);

        registrar=(Button)findViewById(R.id.reg);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(MainActivity.this, RegistroActivity.class);
                startActivity(registrar);
            }
        });






    }

    public void callLogin(View view) {
       progressBar.setVisibility(View.VISIBLE);

        String usuario = usuarioInput.getText().toString();
        String password = passwordInput.getText().toString();

        if (usuario.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Debe completar todos los campos", Toast.LENGTH_LONG).show();
            return;
        }

        //Logica del Login

        User user = UserRepository.login(usuario, password);

        if (user == null) {

            Toast.makeText(this, "El usuario o la cotraseña son invalidos", Toast.LENGTH_LONG).show();
            progressBar.setVisibility(View.GONE);
            return;
        }
        Toast.makeText(this, "Bienvenido " + user.getNombres(), Toast.LENGTH_LONG).show();
        goDashboard();

    }

        private void goDashboard(){
        startActivity(new Intent(this, PerfilActivity.class));
        finish();
    }
    public void callRegisterForm(View view){
        startActivityForResult(new Intent(this, RegistroActivity.class), REGISTER_FORM_REQUEST);
    }

}
