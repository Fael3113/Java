package aula0327;

import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int acumulador = 0, contador = 0;
        boolean online = true;
        while (online){
            System.out.println("Informe sua idade: ");
            int auxiliar = tc.nextInt();
            acumulador += auxiliar;
            contador++;
            System.out.println("Deseja continuar?[S]/[N]");
            char continuar = tc.next().toUpperCase().charAt(0);
            if (continuar == 'N'){
                online = false;
            }
        }
        tc.close();
        System.out.println("Media = " + (double)acumulador/contador);
    }
}