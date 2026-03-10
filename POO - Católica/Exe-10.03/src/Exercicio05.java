import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double salarioAtual;
        double aumento;

        System.out.println("Digite seu salário atual: ");
        salarioAtual = ler.nextDouble();

        System.out.println("Digite a porcentagem de aumento do seu salário: ");
        aumento = ler.nextDouble();
        aumento *= 0.01;

        System.out.println("\nSeu novo salário aumentado é de: "
                +  String.format("%.2f", (salarioAtual + (salarioAtual * aumento)))
                + " R$");
        System.out.println("O aumento foi de: " + String.format("%.2f", (salarioAtual * aumento)) + " R$");

    }
}
