package aula0327;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        // fatorial = 0 para soma/subtração fatorial = 1 para multiplicação
        int numero, fatorial = 1;
        System.out.println("Entre com um numero inteiro:");
        numero = tc.nextInt();
        for (int i = numero; i > 0; i--){
            fatorial *= i;
        }
        tc.close();
        System.out.printf("%d! = %d \n", numero, fatorial);       
    }
}
