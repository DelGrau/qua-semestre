package com.example.trabalhobimestral;

import com.example.trabalhobimestral.modelo.Cliente;
import com.example.trabalhobimestral.modelo.Item;
import com.example.trabalhobimestral.modelo.Pedido;

import java.util.ArrayList;

public class Controller {

    private static Controller instancia;
	
    private ArrayList<Cliente> listaClientes;
	private ArrayList<Item> listaItems;
	private ArrayList<Pedido> listaPedidos;

    public static Controller getInstancia(){
        if(instancia == null) {
            return instancia = new Controller();
        }else {
            return instancia;
        }
    }

    private Controller() {
        listaClientes = new ArrayList<>();
		listaItems = new ArrayList<>();
		listaPedidos = new ArrayList<>();
    }

	// Salvar e Retornar Clientes
    public void salvarCliente(Cliente cliente) { listaClientes.add(cliente); }
	
	public ArrayList<Cliente> retornarClientes() { return listaClientes; }
	
	// Salvar e Retornar Items
	public void salvarItem(Item item) { listaItems.add(item); }
	
	public ArrayList<Item> retornarItems() { return listaItems; }
	
	// Salvar e Retornar Pedidos
	public void salvarPedido(Pedido pedido) { listaPedidos.add(pedido); }
	
	public ArrayList<Pedido> retornarPedidos() { return listaPedidos; }

}
