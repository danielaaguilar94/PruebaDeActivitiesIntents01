package com.example.pruebadeactivitiesintents01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BienvenidaActivity extends AppCompatActivity {

    TextView tvBienv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        tvBienv = findViewById(R.id.tvbienvenido);
        Bundle miBundle = this.getIntent().getExtras();

        if(miBundle!=null)
        {
            String nombre = miBundle.getString("nombre");
            tvBienv.setText("Bienvenid@: "+nombre);
        }

    }




    public void onClick(View view) {
        finish();
    }
}
