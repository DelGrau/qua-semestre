package com.example.trabalhobimestral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.trabalhobimestral.modelo.Cliente;

public class CadastroClienteActivity extends AppCompatActivity {

    private EditText edCpfCliente;
    private EditText edNomeCliente;
    private Button btSalvarCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);

        edCpfCliente = findViewById(R.id.edCpfCliente);
        edNomeCliente = findViewById(R.id.edNomeCliente);
        btSalvarCliente = findViewById(R.id.btSalvarCliente);

        btSalvarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { salvarCliente(); }
        });
    }

    private void salvarCliente() {
		
        int cpf;

        if(edCpfCliente.getText().toString().isEmpty()) {
            edCpfCliente.setError("O CPF deve ser informado!");
            return;
        } else {
            try {
                cpf = Integer.parseInt(edCpfCliente.getText().toString());
            } catch (Exception ex) {
                edCpfCliente.setError("Informe um CPF válido (somente números)!");
                return;
            }
        }

        if(edNomeCliente.getText().toString().isEmpty()) {
            edNomeCliente.setError("O Nome deve ser informado!");
            return;
        }

        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        cliente.setNome(edNomeCliente.getText().toString());

        Controller.getInstancia().salvarCliente(cliente);

        Toast.makeText(CadastroClienteActivity.this,
                "Cliente Cadastrado com Sucesso!!", Toast.LENGTH_LONG).show();

        finish();
    }
}