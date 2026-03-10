import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float[] num = new float[4];
        float resultado = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o valor " + (i+1) + ": ");
            num[i] = ler.nextFloat();
            resultado += num[i];
        }

        System.out.println("Resultado da soma: " + resultado);
    }
}
