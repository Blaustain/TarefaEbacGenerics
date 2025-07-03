package com.SamuelSouza.br;

import java.util.ArrayList;
import java.util.List;

public class ListaCarro<T extends Carro>{

    private List<T> Carros = new ArrayList<>();

    public void adicionarCarro(T Carro){
        Carros.add(Carro);
    }

    public void exibirTodos(){
        for (T Carro: Carros){
            Carro.exibirInfo();

        }
    }


}
