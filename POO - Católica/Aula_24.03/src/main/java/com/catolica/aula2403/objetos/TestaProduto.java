package com.catolica.aula2403.objetos;

public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 10, 20.50);
        p1.exibirInfo();
        p1.removerEstoque(2);
        p1.exibirInfo();
        p1.removerEstoque(10);
        p1.exibirInfo();

        /*
        Tudo funcionando como esperado
         */
    }
}
