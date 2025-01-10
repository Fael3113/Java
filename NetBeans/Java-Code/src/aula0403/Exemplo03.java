package aula0403;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        boolean online = true;
        int cont = 0;
        double total = 0;
        while (online) {            
            System.out.println("Digite sua nota");
            double nota = tc.nextDouble();
            if (nota <= 10 && nota >= 0) {
                total += nota; 
                cont++;
            } else {
                System.out.println("Digite uma nota valida");
            }
            System.out.println("Deseja continuar? [S]/[N]:");
            char continuar = tc.next().toUpperCase().charAt(0);
            if (continuar == 'N') {
                System.out.printf("Media de notas: %.2f\n", total/cont);
                online = false;
            }
        }
        tc.close();
    }
}    