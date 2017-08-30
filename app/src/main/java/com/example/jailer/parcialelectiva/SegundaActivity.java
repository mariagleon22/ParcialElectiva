package com.example.jailer.parcialelectiva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView txtNombres,txtApellidos, txtDireccion,txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtNombres= (TextView) findViewById( R.id.txtNombres);
        txtApellidos= (TextView) findViewById( R.id.txtApellidos );
        txtDireccion= (TextView) findViewById( R.id.txtDireccion);
        txtEmail= (TextView) findViewById( R.id.txtEmail);


        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {


            String nombre=(String)extras.get("Nombre");
            String apellios=(String)extras.get("Apellidos");
            String direccion=(String)extras.get("Direccion");
            String email=(String)extras.get("Email");



            txtNombres.setText(nombre);
            txtApellidos.setText(apellios);
            txtDireccion.setText(direccion);
            txtEmail.setText(email);

        }
    }

}
