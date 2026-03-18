package com.ucb.aula.infos;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPessoa(sc);
                    break;
                case 2:
                    listarPessoas();
                    break;
            }

        } while (opcao != 0);
    }

    private void cadastrarPessoa(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        Pessoa p = new Pessoa(cpf, nome, idade, email);

        pessoas.add(p);

        System.out.println("Pessoa cadastrada!");
    }

    private void listarPessoas() {
        for (Pessoa p : pessoas) {
            p.exibir();
        }
    }
}