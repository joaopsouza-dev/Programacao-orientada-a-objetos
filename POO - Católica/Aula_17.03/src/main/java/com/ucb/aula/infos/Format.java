package com.ucb.aula.infos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Format {

    public static void formatarTelefone(String telefone) {
        String regex = ("(\\d{2})(\\d{4,5})(\\d{4})");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if(matcher.matches()) {
            System.out.printf("(%s) %s-%s%n", matcher.group(1), matcher.group(2), matcher.group(3));
        } else {
            System.out.println("ERRO NO NUMERO DIGITADO");
        }
    }

    public static void formatarEmail(String email) {
        String regex = "^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()) {
            System.out.println(email);
        } else  {
            System.out.println("ERRO NO EMAIL DIGITADO");
        }
    }
}
