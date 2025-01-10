package aula0403;

import java.util.Random;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);       
        Random gerador = new Random();
        int receptor = gerador.nextInt(1,11);
        System.out.println("Insira um numero: ");    
        int num = tc.nextInt();
        while (num != receptor){
            System.out.println("\nTente novamente");
            num = tc.nextInt();
        }
        System.out.println("\nVoce acertou!!\n" + 
                "O numero digitado "+ num + "\n"
              + "O numero sorteado "+ receptor);     
    tc.close();
    }
}
