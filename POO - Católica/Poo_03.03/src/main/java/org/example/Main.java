package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("string sendo digitada manualmente: João Pedro\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com seu nome");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é: " + nome);


    }
}