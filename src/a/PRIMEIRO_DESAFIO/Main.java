package a.PRIMEIRO_DESAFIO;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        System.out.print("Digite a quantidade de valores de entrada (maior que 1 e menor que 100000): ");
        int n = in.nextInt();
        if(n < 1 || n >= 100000){
            System.out.println("O número deve ser maior que  1 e menor que 100000 ");
            return;
        }
        for(int i = 1; i <= n; i++){
            System.out.print(i + "° Entrada de valor: ");
            int num = in.nextInt();
            if(num < 0) {
                System.out.println("Não adicione valores negativos");
                break;
            }
            if(num % 2==0 ){
                pares.add(num);
            }
            else {
                impares.add(num);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);
        pares.forEach(System.out::println);
        impares.forEach(System.out::println);
        in.close();
    }
}