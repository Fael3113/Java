package aula0320;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        int num = tc.nextInt();
        if (num % 2 == 0 && num >= 0){
            System.out.println("Par e positivo");
        } else if (num % 2 == 0 && num < 0){
            System.out.println("Par e negativo");
        } else if (num % 2 != 0 && num >= 0){
            System.out.println("Impar e postivo");
        } else {
            System.out.println("Impar e negativo");
        }
        tc.close();
    }
}
