package aula0327;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int contador = 0, acumulador = 0;
        for (int i = 1; i <= 4; i++){
            System.out.println("Informe a nota " + i + ":");
            acumulador += tc.nextInt();
            contador = contador + 1;
            System.out.println("Deseja continuar?[S]/[N]");
            char continuar = tc.next().toUpperCase().charAt(0);
            if (continuar == 'N'){
                break;
            }    
        }
        tc.close();
        System.out.println("Acumulador = " + acumulador);
        System.out.println("Contador = " + contador);
        System.out.println("Media = " +(double)acumulador /contador);
    }
}
