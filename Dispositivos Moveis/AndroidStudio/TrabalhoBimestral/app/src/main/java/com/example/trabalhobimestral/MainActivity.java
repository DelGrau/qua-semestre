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

	private Button btListaClientes;
	private Button btListaItems;
	private Button btListaPedidos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCadastrarCliente = findViewById(R.id.btCadastrarCliente);
        btCadastrarItem = findViewById(R.id.btCadastrarItem);
        btNovoPedido = findViewById(R.id.btNovoPedido);

        btListaClientes = findViewById(R.id.btListaClientes);
        btListaItems = findViewById(R.id.btListaItems);
        btListaPedidos = findViewById(R.id.btListaPedidos);

        // Botão de Cadastrar Clientes e Lista de Clientes
        btCadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(CadastroClienteActivity.class); }
        });

        /*
        btListaCliente.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(ListaClientesActivity.class); }
        });

        // Botão de Cadastrar Item e de Lista de Items
        btCadastrarItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(CadastroItemActivity.class); }
        });

        btListaItems.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(ListaItemsActivity.class); }
        });

        // Botão de Novo Pedido e Lista de Pedidos
        btNovoPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(NovoPedidoActivity.class); }
        });

        btListaPedidos.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View view) { abrirActivity(ListaPedidosActivity.class); }
        });

         */
    }

    private void abrirActivity(Class<?> activity) {
        Intent intent = new Intent(MainActivity.this, activity);
        startActivity(intent);
    }
}