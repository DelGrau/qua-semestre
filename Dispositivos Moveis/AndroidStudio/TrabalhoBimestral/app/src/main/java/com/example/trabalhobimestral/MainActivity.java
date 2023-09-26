package com.example.trabalhobimestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btCadastrarCliente;
    private Button btCadastrarItem;
    private Button btNovoPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCadastrarCliente = findViewById(R.id.btCadastrarCliente);
        btCadastrarItem = findViewById(R.id.btCadastrarItem);
        btNovoPedido = findViewById(R.id.btNovoPedido);

        btCadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(CadastroClienteActivity.class); }
        });

        /*

        btCadastrarItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(CadastroItemActivity.class); }
        });

        btNovoPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(NovoPedidoActivity.class); }
        });

         */
    }

    private void abrirActivity(Class<?> activity) {
        Intent intent = new Intent(MainActivity.this, activity);
        startActivity(intent);
    }
}