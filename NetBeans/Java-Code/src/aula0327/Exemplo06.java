package aula0327;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int entrada;
        System.out.println("Digite um numero entre 1 e 10");
        entrada = tc.nextInt();
        if (entrada >= 1 && entrada <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d \n", entrada, i, (entrada * i));
            }
        } else {
            System.out.println("Voce digitou algo errado");
        }
        tc.close();
    }
}

