package aula0320;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        String nome = "Zezinho";
        
        Scanner tc = new Scanner (System.in);
        System.out.println("Digite 3 numeros diferentes entre 0 e 1");
        int fome = tc.nextInt();
        int sede = tc.nextInt();
        int sono = tc.nextInt();
        tc.close();
        if (fome == 0 && sede == 0 && sono == 0 ){
            System.out.println("Acordou e saiu");
        } else if (fome == 0 && sede == 0 && sono != 0){
            System.out.println(" Acordou, fez um cafe e saiu"); 
        } else if (fome == 0 && sede != 0 && sono == 0){
            System.out.println("Acordou, bebeu agua e voltou a dormir");
        }     
    }
}
