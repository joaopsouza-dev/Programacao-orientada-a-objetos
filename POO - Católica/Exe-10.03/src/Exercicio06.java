import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salarioAtual;
        double gratificacao = 0.05;


        System.out.println("Digite seu salário base: ");
        salarioAtual = ler.nextDouble();

        salarioAtual += (salarioAtual * gratificacao);

        System.out.println("Seu salário com a gratificação é de: " + String.format("%.2f", salarioAtual) + " R$");

        salarioAtual -= (salarioAtual * 0.07);

        System.out.println("Com os impostos, seu salário equivale à: " + String.format("%.2f", salarioAtual) + " R$");
    }
}
