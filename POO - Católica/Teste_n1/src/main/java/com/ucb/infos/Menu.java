package com.ucb.infos;

import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    private int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void openMenu () {
        System.out.println("OPÇÕES DE OPERAÇÃO:");
        System.out.println("1- Criar carro");
        System.out.println("2- Mostrar lista de carros");
        System.out.println("3- Remover carro da lista");
        System.out.println("4- Atualizar informações do carro");
        System.out.println("\nDigite a opção que você deseja: ");
        opcao = scan.nextInt();
    }
}
