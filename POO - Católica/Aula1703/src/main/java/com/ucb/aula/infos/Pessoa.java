package com.ucb.aula.infos;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private double altura;
    private double peso;
    private int idade;
    private double imc;
    Scanner scan = new Scanner(System.in);


    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void infos() {

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        System.out.println("Digite seu CPF: ");
        cpf = scan.nextLine();

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();

        System.out.println("Digite seu peso: ");
        peso = scan.nextDouble();
    }

    public void exibirImc() {
        this.imc = this.peso / (this.altura * this.altura);
        System.out.println("Seu IMC é de: " + String.format("%.2f", imc));
    }
    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + ", e sou portador do CPF " + cpf);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m e meu peso é " + peso + "Kg");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
