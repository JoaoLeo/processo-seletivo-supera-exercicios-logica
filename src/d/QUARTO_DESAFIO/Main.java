package d.QUARTO_DESAFIO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade de casos teste: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Digite um valor valido");
            return;
        }
        in.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Linha: ");
            String line = in.nextLine();
            String decodedLine = decodeString(line);
            System.out.println(decodedLine);
        }

        in.close();
    }

    public static String decodeString(String line) {
        int length = line.length();
        StringBuilder decodedLine = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            decodedLine.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            decodedLine.append(line.charAt(i));
        }

        return decodedLine.toString();
    }
}