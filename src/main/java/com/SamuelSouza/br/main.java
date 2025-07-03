package com.SamuelSouza.br;

public class main {
    public static void main(String[] args){
        ListaCarro<Carro>  lista = new ListaCarro<>();
        lista.adicionarCarro(new Toyota("Corolla",2024));
        lista.adicionarCarro(new Ford("Fiesta",2025));
        
        lista.exibirTodos();

    }
}
