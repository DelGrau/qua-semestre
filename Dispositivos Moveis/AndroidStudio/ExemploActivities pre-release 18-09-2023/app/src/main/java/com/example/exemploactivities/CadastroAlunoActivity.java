package com.example.exemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CadastroAlunoActivity extends AppCompatActivity {

    public Button btSalvar;
    public EditText edRA;
    public EditText edNome;
    public TextView tvListaAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        btSalvar = findViewById(R.id.btSalvar);
        edRA = findViewById(R.id.edRA);
        edNome = findViewById(R.id.edNome);
        tvListaAluno = findViewById(R.id.tvListaAluno);
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarAluno();
            }
        });
        atualizaLista();
    }

    private void salvarAluno() {
        int ra;
        if (edRA.getText().toString().isEmpty()) {
            edRA.setError("O RA do aluno deve ser informado");
            return;
        } else {
            try {
                ra = Integer.parseInt(edRA.getText().toString());
            } catch (Exception ex) {
                edRA.setError("Informe um RA válido (somente números)");
                return;
            }
        }

        if (edNome.getText().toString().isEmpty()) {
            edNome.setError("O Nome do aluno deve ser informado");
            return;
        }

        Aluno aluno = new Aluno();
        aluno.setRa(ra);
        aluno.setNome(edNome.getText().toString());

        Controller.getInstancia().salvarAluno(aluno);

        Toast.makeText(CadastroAlunoActivity.this,
                "Aluno cadastrado com Sucesso!", Toast.LENGTH_LONG).show();

        finish();
    }

    private void atualizaLista() {
        String texto = "";
        ArrayList<Aluno> lista = Controller.getInstancia().retornarLista();
        for (Aluno aluno : lista) {
            texto += aluno.getRa()+" - "+aluno.getNome()+"\n";
        }
        tvListaAluno.setText(texto);
    }
}
