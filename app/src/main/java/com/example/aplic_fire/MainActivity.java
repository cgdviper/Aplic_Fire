package com.example.aplic_fire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText tx_R, tx_N;
    Button btn1;
    private DatabaseReference mDatabase;// ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx_R = (EditText) findViewById(R.id.txt_run);
        tx_N = (EditText) findViewById(R.id.txt_nom);
        btn1 = (Button) findViewById(R.id.btn_1);

        FirebaseDatabase DATOS = FirebaseDatabase.getInstance();
        mDatabase = DATOS.getReference(MisReferencias.usuario_referencia);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Write a message to the database
                Persona miPersona = new Persona(tx_R.getText().toString().toUpperCase().trim(),tx_N.getText().toString().toUpperCase().trim());
                mDatabase.child("").push().setValue(miPersona);

            }
        });

    }

}
