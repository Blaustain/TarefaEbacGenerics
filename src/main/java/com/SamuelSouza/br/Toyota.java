package com.SamuelSouza.br;

public class Toyota  extends Carro{

    public Toyota(String Modelo, int Ano){
        super(Modelo, Ano);
    }

    @Override
    public void exibirInfo(){
        System.out.println("Toyota - Modelo:" + getModelo()+",Ano:" + getAno());
    }
}
