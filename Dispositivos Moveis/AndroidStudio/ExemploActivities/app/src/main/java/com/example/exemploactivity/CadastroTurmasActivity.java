package com.example.exemploactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.exemploactivities.R;
import com.example.exemploactivity.modelo.Aluno;

import java.util.ArrayList;

public class CadastroTurmasActivity extends AppCompatActivity {

    ArrayList<Aluno> listaAlunos;
    AutoCompleteTextView tvAdicionarAlunos;

    private Spinner spPeriodo;

    private RadioGroup rbAnual;
    private RadioGroup rbSemestral;
    private RadioGroup rgSistema;
    private String[]vetAnual = new String[]{"1º Ano", "2º Ano", "3º Ano"};
    private String[]vetSemestral = new String[]{"1º Semestre", "2º Semestre",
            "3º Semestre", "4º Semestre",
            "5º Semestre", "6º Semestre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_turmas);
        setTitle("Cadastro Turmas");

        tvAdicionarAlunos = findViewById(R.id.tvAdicionarAlunos);
        rbAnual = findViewById(R.id.rbAnual);
        rbSemestral = findViewById(R.id.rbSemestral);
        rgSistema = findViewById(R.id.rgSistema);
        spPeriodo = findViewById(R.id.spPeriodo);

        rgSistema.setOnCheckedChangeListener();

        tvAdicionarAlunos = findViewById(R.id.tvAdicionarAlunos);
        carregarAlunos();
    }

    private void carregarAlunos() {
        listaAlunos = Controller.getInstancia().retornarAlunos();
        String[] vetAlunos = new String[listaAlunos.size()];

        for(int i = 0; i < listaAlunos.size(); i++) {
            Aluno aluno = listaAlunos.get(i);
            vetAlunos[i] = aluno.getNome();
        }

        ArrayAdapter adapter = new ArrayAdapter(
                CadastroTurmasActivity.this,
                android.R.layout.simple_dropdown_item_1line,
                vetAlunos);

        tvAdicionarAlunos.setAdapter(adapter);
    }

    private void carregarPeriodo() {
        ArrayAdapter adapter = null;
        if(rbAnual.isChecked()){
            adapter = new ArrayAdapter<>(CadastroTurmasActivity.this,
            android.R.layout.simple_dropdown_item_1line,
            vetAnual);
        } else if (rbSemetral.isChecked()){
            adapter = new ArrayAdapter<>(CadastroTurmasActivity.this,
                    android.R.layout.simple_dropdown_item_1line,
                    vetSemestral);
        }

        spPeriodo.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_padrao, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mn_salvar) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}