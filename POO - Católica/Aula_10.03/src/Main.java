import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João Pedro", 19, 2011196818);
        pessoa1.setDataNascimento(LocalDate.of(2007, 3, 5));
        pessoa1.setEmail("contato.joaopsouzap@gmail.com");

        Pessoa pessoa2 = new Pessoa("Maria Joaquina", 25, 701927390);
        pessoa2.setDataNascimento(LocalDate.of(2001, 1, 29));
        pessoa2.setEmail("mariajoaquina24@hotmail.com");

        System.out.println("\n");
        pessoa1.apresentação();
        pessoa1.falarEmail();
        System.out.println("\n===========================\n");
        pessoa2.apresentação();
        pessoa2.falarEmail();


    }
}