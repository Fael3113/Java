package aula0313;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = tc.nextInt();
        if(numero % 2 == 0){
            if (numero >= 0){
                System.out.println("Par e Positivo");
            } else {
                System.out.println("Par e Negativo");
            }
        } else {
            if (numero >= 0){
                System.out.println("Impar e Positivo");
            } else{
                System.out.println("Impar e Negativo");
            }
        }            
    }
}