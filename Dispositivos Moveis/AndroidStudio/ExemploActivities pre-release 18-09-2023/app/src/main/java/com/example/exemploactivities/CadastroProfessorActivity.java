package com.example.exemploactivities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroProfessorActivity extends AppCompatActivity {

    public EditText edMatriculaProfessor;
    public EditText edNomeProfessor;
    public EditText edCpfProfessor;
    public EditText edDataNascimentoProfessor;
    public EditText edDataAdmissaoProfessor;
    public Button btSalvarProfessor;
    public TextView tvListaProfessor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_professor);

        edMatriculaProfessor = findViewById(R.id.edMatriculaProfessor);
        edNomeProfessor = findViewById(R.id.edNomeProfessor);
        edCpfProfessor = findViewById(R.id.edCpfProfessor);
        edDataNascimentoProfessor = findViewById(R.id.edDataNascimentoProfessor);
        edDataAdmissaoProfessor = findViewById(R.id.edDataAdmissaoProfessor);
        btSalvarProfessor = findViewById(R.id.btSalvarProfessor);
        tvListaProfessor = findViewById(R.id.tvListaProfessor);
        btSalvarProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

