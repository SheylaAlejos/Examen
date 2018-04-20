package tecsup.sheyla.com.examen.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import tecsup.sheyla.com.examen.R;
import tecsup.sheyla.com.examen.repositories.UserRepository;

public class RegistroActivity extends AppCompatActivity {

    private EditText usuarioInput;
    private EditText nombresInput;
    private  EditText emailInput;
    private  EditText passwordInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        usuarioInput =(EditText) findViewById(R.id.nombre);
        nombresInput =(EditText) findViewById(R.id.nombrecompleto);
        emailInput =(EditText) findViewById(R.id.correo);
        passwordInput =(EditText) findViewById(R.id.contraseña);
    }

    public void callRegister(View view){
        String usuario = usuarioInput.getText().toString();
        String nombres = nombresInput.getText().toString();
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        if (usuario.isEmpty() || nombres.isEmpty() || email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Registrar todos los campos", Toast.LENGTH_SHORT).show();
        }

        UserRepository.create(usuario, nombres, email,password);
        finish();
    }

}
