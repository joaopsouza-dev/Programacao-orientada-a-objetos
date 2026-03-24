package com.ucb.aula.main;

import com.ucb.aula.infos.Calculadora;
import com.ucb.aula.infos.Pessoa;

public class Main {

    public static void main(String[] args) {


        //testando instancia de pessoas
        Pessoa p1 = new Pessoa("70119460122", "João Pedro", 19,"contato.joaopsouzap@gmail.com");
        p1.setTelefone("61992550895");
        String telefoneFormatado = p1.formatarTelefone(p1.getTelefone());
        System.out.println(telefoneFormatado);

        //sobrecarga de métodos
        Calculadora c = new Calculadora();
        int resultado1 = c.somar(10, 15);
        int resultado2 = c.somar(20, 30, 40, 50);
        int resultado3 = c.somar(10, 20, 30);

        System.out.println("resultados: " + resultado1 + " / " + resultado2 + " / " + resultado3);


    }
}