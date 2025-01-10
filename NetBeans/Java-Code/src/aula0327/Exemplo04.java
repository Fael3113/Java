package aula0327;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int acumulador = 0, contador = 0;
        for (int i = 1;  ;){
            System.out.println("Insina -1 para sair do programa e"
                            +"visualizar a media das idades");
            System.out.println("Informe sua idade: ");
            int auxiliar = tc.nextInt();
            if (auxiliar == -1){
                break;
            } else {
                acumulador += auxiliar;
                contador++;
            }
        }
        tc.close();
        System.out.println("Media = " + (double)acumulador/contador);
    }
}
