package com.example.exemploactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btCadastroAluno;
    private Button btCadastrarProfessor;
    private Button btCadastrarDisciplina;
    private Button btCadastroTurma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout.activity_main);

        btCadastroAluno = findViewById(R.id.btCadastroAluno);
        btCadastrarProfessor = findViewById(R.id.btCadastroProfessor);
        btCadastrarDisciplina = findViewById(R.id.btCadastroDisciplina);
        btCadastroTurma = findViewById(R.id.btCadastroTurma);

        btCadastroAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity(CadastroAlunoActivity.class);
            }
        });

        btCadastrarProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity(CadastroProfessorActivity.class);
            }
        });
        btCadastrarDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity(CadastroDisciplinaActivity.class);
            }
        });

        btCadastroTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity(CadastroTurmasActivity.class);
            }
        });

    }

    private void abrirActivity(Class<?> activity) {
        Intent intent = new Intent(MainActivity.this, activity);
        startActivity(intent);
    }
}