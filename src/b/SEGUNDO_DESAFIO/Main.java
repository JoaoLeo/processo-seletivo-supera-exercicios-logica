package b.SEGUNDO_DESAFIO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Usando locale dos eua para que o programa use ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.print("Digite o valor monetário: ");
        double valor = in.nextDouble();
        if(valor <= 0 || valor >= 1000000.00){
            System.out.println("Valor inválido");
            return;
        }
        int centavos = (int) (valor * 100);

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtd = centavos / (nota * 100);
            System.out.printf("%d nota(s) de R$ %.2f%n", qtd, (double) nota);
            centavos %= nota * 100;
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int qtd = centavos / (int) (moeda * 100);
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtd, moeda);
            centavos %= (moeda * 100);
        }
        in.close();
    }
}