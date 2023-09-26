package com.example.trabalhobimestral.modelo;

public class Item {

    private int codigo;
	private double vlUnitario;
    private String descricao;

    public Item() {
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }
	
	public double getVlUnitario() {
        return this.vlUnitario;
    }

    public void setVlUnitario(double vlUnitario) {
        this.vlUnitario = vlUnitario;
    }
}