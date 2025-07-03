package com.SamuelSouza.br;

public class Ford  extends Carro{

    public Ford (String Modelo, int Ano){
        super(Modelo, Ano);
    }

    @Override
    public void exibirInfo(){
        System.out.println("Ford - Modelo: " + getModelo() +",Ano:" +getAno());
    }
}
