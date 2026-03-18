package com.ucb.aula.infos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa {
    private String nome;
    private String cpf;
    private double altura;
    private double peso;
    private int idade;
    private String email;
    private double imc;
    private String telefone;
    Scanner scan = new Scanner(System.in);


    public Pessoa(String cpf, String nome, int idade, String email) {
    }

    public void formatarTelefone(String telefone) {
        String regex = ("(\\d{2})(\\d{4,5})(\\d{4})");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if(matcher.matches()) {
            System.out.println(String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3)));
        } else {
            System.out.println("ERRO NO NUMERO DIGITADO");
        }
    }



    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void contruir() {
        System.out.println("Digite seu nome: ");
        this.nome = scan.nextLine();

        System.out.println("Digite seu CPF: ");
        this.cpf = scan.nextLine();

        System.out.println("Usuário criado com sucesso. Prossiga para as informações adicionais obrigatórias");

    }

    public void infos(Pessoa pessoa) {

        System.out.println("Digite sua idade: ");
        this.idade = scan.nextInt();

        System.out.println("Digite sua altura: ");
        this.altura = scan.nextDouble();

        System.out.println("Digite seu peso: ");
        this.peso = scan.nextDouble();

        System.out.println("Digite seu email: ");
        this.email = scan.nextLine();

        System.out.println("Digite seu número da telefone: ");
        this.telefone = scan.nextLine();

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void exibir() {
        System.out.println("Olá! Meu nome é " + this.nome + ", e sou portador do CPF " + this.cpf);
        System.out.println("Tenho " + this.idade + " anos");
        System.out.println("Minha altura é " + this.altura + "m e meu peso é " + this.peso + "Kg");
    }
}
