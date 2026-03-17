package com.ucb.main;

import com.ucb.infos.Apresentacao;
import com.ucb.infos.Menu;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Apresentacao ap = new Apresentacao();

        ap.apresentar();
        menu.openMenu();
    }
}