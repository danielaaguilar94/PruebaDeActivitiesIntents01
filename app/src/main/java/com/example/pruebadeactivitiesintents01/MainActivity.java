package com.example.pruebadeactivitiesintents01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etnombre;
    TextView tvmensaje;
    Button btnIngresar, btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre = findViewById(R.id.etNombre);
        tvmensaje=findViewById(R.id.tvmsj);
        btnIngresar=findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(this);
        btnEnviar=findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnIngresar)
        {
            String nombre= etnombre.getText().toString();
            tvmensaje.setText("Hola: " +nombre);
            Toast.makeText(getApplicationContext(),"nombre ingresado: "+nombre,Toast.LENGTH_LONG).show();
        }
        if (view.getId()==R.id.btnEnviar)
        {
            Intent miIntent = new Intent(MainActivity.this,BienvenidaActivity.class);
            Bundle miBundle = new Bundle();
            miBundle.putString("nombre",etnombre.getText().toString());
            miIntent.putExtras(miBundle);
            startActivity(miIntent);


        }
    }
}
