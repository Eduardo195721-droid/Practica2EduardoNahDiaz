package com.example.practica2eduardonahdiaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombreCompleto, telef, eMail, twitter;
    Button botonsig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombreCompleto = findViewById(R.id.name);
        telef = findViewById(R.id.telefono);
        eMail = findViewById(R.id.email);
        twitter = findViewById(R.id.twitter);
        Bundle datosnew = getIntent().getExtras();
        if (datosnew != null){
            nombreCompleto.setText(datosnew.getString("nombre"));
            telef.setText(datosnew.getString("telefono"));
            eMail.setText(datosnew.getString("correo"));
            twitter.setText(datosnew.getString("twitter"));

        }


        botonsig = findViewById(R.id.bt_enviar);
        botonsig.setOnClickListener(clik);


    }

    View.OnClickListener clik = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            nombreCompleto = findViewById(R.id.name);
            telef = findViewById(R.id.telefono);
            eMail = findViewById(R.id.email);
            twitter = findViewById(R.id.twitter);
            String nomCompleto = nombreCompleto.getText().toString();
            String tele = telef.getText().toString();
            String correoElec = eMail.getText().toString();
            String twiter = twitter.getText().toString();
            Intent inten = new Intent(MainActivity.this,MainActivity2.class);
            inten.putExtra("nombreComp", nomCompleto);
            inten.putExtra("telefono",tele);
            inten.putExtra("correoelectronico",correoElec);
            inten.putExtra("twitter",twiter);
            startActivity(inten);


        }
    };
}