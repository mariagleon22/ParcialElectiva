package com.example.jailer.parcialelectiva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtNombres,txtApellidos,txtDireccion,txtEmail;

    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar=(Button)findViewById(R.id.btnEnviar);
        txtNombres = (EditText) findViewById( R.id.txtNombres);
        txtApellidos = (EditText) findViewById( R.id.txtApellidos );
        txtDireccion= (EditText) findViewById( R.id.txtDireccion );
        txtEmail= (EditText) findViewById( R.id.txtEmail );

        btnEnviar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent  intent = new Intent(this, SegundaActivity.class);

        String nombre = txtNombres.getText().toString();
        String apellido = txtApellidos.getText().toString();
        String direccion = txtDireccion.getText().toString();
        String email = txtEmail.getText().toString();


        intent.putExtra("Nombre",nombre);
        intent.putExtra("Apellidos", apellido);
        intent.putExtra("Direccion", direccion);
        intent.putExtra("Email",email);

        startActivity(intent);
    }
}

