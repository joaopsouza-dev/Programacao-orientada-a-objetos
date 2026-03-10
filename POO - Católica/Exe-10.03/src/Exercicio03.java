import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float[] notas =  new float[3];
        float[] pesos =  new float[3];
        float media;
        float soma = 0;
        float somaPesos = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = ler.nextFloat();

            System.out.println("Digite o peso " + (i+1) + ": ");
            pesos[i] = ler.nextFloat();

            soma += (notas[i] * pesos[i]);
            somaPesos += pesos[i];

        }
        media = soma / somaPesos;

        System.out.println("Media ponderada: " + String.format("%.2f", media));
    }
}
