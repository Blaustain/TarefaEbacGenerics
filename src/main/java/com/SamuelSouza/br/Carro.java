package com.SamuelSouza.br;

public abstract class Carro {

    private String modelo;
    private int ano;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;

    }

    public abstract void exibirInfo();
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
}
