package com.example.practica2eduardonahdiaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nombreView,celularView,correoView,twitterView;
    Button editcampo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle datos = getIntent().getExtras();
        String nombre = datos.getString("nombreComp");
        String telefono = datos.getString("telefono");
        String correoElectronico = datos.getString("correoelectronico");
        String twitter = datos.getString("twitter");

        nombreView = findViewById(R.id.tvnombre);
        celularView = findViewById(R.id.tvtelefono);
        correoView = findViewById(R.id.tvcorreo);
        twitterView = findViewById(R.id.tvtwitter);

        nombreView.setText(nombre);
        celularView.setText(telefono);
        correoView.setText(correoElectronico);
        twitterView.setText(twitter);

        editcampo = findViewById(R.id.botoneditar);
        editcampo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent datosRegresados = new Intent(MainActivity2.this,MainActivity.class);
                String user = String.valueOf(nombreView.getText());
                String telef = String.valueOf(celularView.getText());
                String correo = String.valueOf(correoView.getText());
                String twiter = String.valueOf(twitterView.getText());
                datosRegresados.putExtra("nombre",user);
                datosRegresados.putExtra("telefono",telef);
                datosRegresados.putExtra("correo",correo);
                datosRegresados.putExtra("twitter", twiter);
                startActivity(datosRegresados);





            }
        });




    }
}