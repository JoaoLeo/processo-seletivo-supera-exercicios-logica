package c.TERCEIRO_DESAFIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        
        System.out.println("Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos\n" +
                "do array em que a sua diferença seja igual ao valor alvo.");
        System.out.print("Digite o tamanho do array: ");
        int sizeArray = in.nextInt();

        if(sizeArray <= 0 ) {
            System.out.println("Digite um valor valido");
            return;
        }

        for (int i = 0; i < sizeArray ; i++) {
            System.out.print((i + 1) + "° elemento do array: ");
            int elemento = in.nextInt();
            arr.add(elemento);

        }
        System.out.print("O array cadastrado foi: [ ");
        arr.forEach(a -> System.out.print(a + " "));
        System.out.println("]");
        System.out.print("Agora digite o valor alvo: ");
        int k = in.nextInt();
        int qtd = valorDiferencaDePares(arr, k);
        System.out.println("Existem " + qtd +" valores cuja diferença é igual ao valor alvo");
        in.close();
    }

    public static int valorDiferencaDePares(List<Integer> arr, int k) {
        Collections.sort(arr);
        int qtd = 0;
        int i = 0;
        int j = 1;

        while (j < arr.size()) {
            int diff = arr.get(j) - arr.get(i);
            if (diff == k) {
                qtd++;
                j++;
            } else if (diff > k) {
                i++;
            } else {
                j++;
            }
        }
        return qtd;
    }
}