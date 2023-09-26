package com.example.trabalhobimestral.modelo;

public class Cliente {

    private int cpf;
    private String nome;

    public Cliente() {
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
