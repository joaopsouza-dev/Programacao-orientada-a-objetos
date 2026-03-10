import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double salarioAtual;
        double salarioFinal;

        System.out.println("Digite seu salário atual: ");
        salarioAtual = ler.nextDouble();

        salarioFinal = salarioAtual + (salarioAtual * 0.25);

        System.out.println("Seu novo salário com o aumento é de: " + String.format("%.2f", salarioFinal) + " R$");

    }
}
