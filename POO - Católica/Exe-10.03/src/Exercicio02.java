import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float[] notas =  new float[3];
        float media;
        float soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = ler.nextFloat();
            soma += notas[i];
        }

        media = soma / 3;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        System.out.println("=================================");
        System.out.println("Média das notas: " + String.format("%.2f", media));
    }
}
