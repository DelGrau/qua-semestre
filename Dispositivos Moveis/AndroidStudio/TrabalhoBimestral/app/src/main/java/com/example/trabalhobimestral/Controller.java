package com.example.trabalhobimestral;

import com.example.trabalhobimestral.modelo.Cliente;

import java.util.ArrayList;

public class Controller {

    private static Controller instancia;
    private ArrayList<Cliente> listaClientes;

    public static Controller getInstancia(){
        if(instancia == null) {
            return instancia = new Controller();
        }else {
            return instancia;
        }
    }

    private Controller() {
        listaClientes = new ArrayList<>();
    }

    public void salvarCliente(Cliente cliente) { listaClientes.add(cliente); }

}
