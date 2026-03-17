package com.ucb.aula.main;

import com.ucb.aula.infos.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João Pedro", "930.038.285-48");
        p1.setAltura(1.75);
        p1.setIdade(19);
        p1.setPeso(77.3);

        p1.apresentar();
        p1.exibirImc();

    }
}