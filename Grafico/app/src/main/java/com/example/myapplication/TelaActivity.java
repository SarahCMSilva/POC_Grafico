package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonPizza;
    private Button buttonBarra;
    private Button buttonLinha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);

        buttonPizza = findViewById(R.id.buttonPizza);
        buttonBarra = findViewById(R.id.buttonBarra);
        buttonLinha = findViewById(R.id.buttonLinha);

        buttonPizza.setOnClickListener(this);
        buttonLinha.setOnClickListener(this);
        buttonBarra.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view.getId() == R.id.buttonPizza){
            Intent telaPizza = new Intent(this,MainActivity.class);
            startActivity(telaPizza);
        }if (view.getId() == R.id.buttonLinha){
            Intent telaLinhas = new Intent(this, LinhasActivity.class);
            startActivity(telaLinhas);
        }
    }



}