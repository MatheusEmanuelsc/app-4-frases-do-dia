package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String [] frases={
                "frase1","frase2","frase3","frase"
        };
        int numero= new Random().nextInt(4);
        TextView frase =findViewById(R.id.frase);
        frase.setText(frases[numero]);
    }
}