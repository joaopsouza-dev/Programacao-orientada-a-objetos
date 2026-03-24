package com.catolica.aula2403.main;

import com.catolica.aula2403.objetos.Produto;

public class Main {
    public static void main(String[] args) {

        //INSTÂNCIA DE PRODUTOS
        Produto p1 = new Produto("Arroz", 10, 19.90);
        Produto p2 = new Produto("Feijão enlatado", 5, 14.90);
        Produto p3 = new Produto("Chocolate", 15, 10.50);

        //PRODUTO 1
        p1.exibirInfo();
        p1.removerEstoque(2);
        p1.removerEstoque(20);
        p1.addEstoque(5);
        System.out.println("\nINFOS ATUALIZADAS:");
        p1.exibirInfo();

        //PRODUTO 2
        System.out.println("\n----- OUTRO PRODUTO -----");
        p2.exibirInfo();
        p2.removerEstoque(3);
        p2.removerEstoque(40);
        p2.addEstoque(25);
        System.out.println("\nINFOS ATUALIZADAS:");
        p2.exibirInfo();

        //PRODUTO 3
        System.out.println("\n----- OUTRO PRODUTO -----");
        p3.exibirInfo();
        p3.removerEstoque(10);
        p3.addEstoque(15);
        p3.removerEstoque(40);
        System.out.println("\nINFOS ATUALIZADAS:");
        p3.exibirInfo();

    }
}