package com.example.exemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btCadastroAluno;
    public Button btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCadastroAluno = findViewById(R.id.btCadastroAluno);

        btCadastroAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCadastroAluno();
            }
        });
    }

    private void abrirCadastroAluno() {
        Intent intent = new Intent(MainActivity.this, CadastroAlunoActivity.class);
        startActivity(intent);
    }
}