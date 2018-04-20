package tecsup.sheyla.com.examen.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import tecsup.sheyla.com.examen.R;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        final EditText nombre =(EditText) findViewById(R.id.nombre);
        final TextView bienvenido = (TextView) findViewById(R.id.bienvenido);

    }
}
