package aula0313;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int idade;
        System.out.println("Qual a sua idade?");
        idade = tc.nextInt();
        
        if (idade <= 11){
            System.out.println("Voce e crianca");
        } else if (idade > 11 && idade <= 17) {
            System.out.println("Voce e adolescente");
        } else if (idade >= 18 && idade <= 150) {
            System.out.println("Voce e adulto");
        } else {
            System.out.println("Matusalem e voce?");
        }
    } 
}
