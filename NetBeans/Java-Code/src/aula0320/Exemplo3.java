package aula0320;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String sexo;
        double altura, pesoIdeal = 0;
        System.out.println("Altura?");
        altura = tc.nextDouble();
        System.out.println("""
                           Inicial do seu sexo biologico:
                           H - Homem
                           M - Mulher""");
        sexo = tc.next();
        tc.close();
        if (sexo.equalsIgnoreCase("h")){
            pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Peso ideal = %.2f", pesoIdeal);
        } else if (sexo.equalsIgnoreCase("m")){
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("Peso ideal = %.2f", pesoIdeal);
        } else {
            System.out.println("Opcao invalida");
        }
    }
}
