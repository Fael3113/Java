package aula0403;

import java.util.Random;
import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Random gerador = new Random();
        var tc = new Scanner(System.in);
        int receptor = gerador.nextInt(1,7);
        int receptor2 = gerador.nextInt(1,7);
        char continuar;
        boolean online = true;
        System.out.println("Lance com 2 dados\n"+
                 "Se a soma dos dados for 10, ninguém ganha\n"+
                 "Se a soma for 7 ou 2, o jogador ganha\n"+
                 "Se a soma for 6, a banca ganha\n"+
                 "Do contrario, os dados são relancados");
        while (online) {
            System.out.printf("O primeiro dado deu o valor: %d\n", receptor);
            System.out.printf("O segundo dado deu o valor: %d\n", receptor2);
            if (receptor + receptor2 == 10) {
                System.out.println("Ninguem ganhou");
                System.out.println("Deseja jogar novamente?[S]/[N]?");
                continuar = tc.next().toUpperCase().charAt(0);
                if (continuar == 'N') {
                    online = false;
                } else {
                    receptor = gerador.nextInt(1,7);
                    receptor2 = gerador.nextInt(1,7);
                }
            } else if (receptor + receptor2 == 2 || receptor + receptor2 == 7) {
                System.out.println("O jogador ganhou e a banca perdeu");
                System.out.println("Deseja jogar novamente?[S]/[N]?");
                continuar = tc.next().toUpperCase().charAt(0);
                if (continuar == 'N') {
                    online = false;
                } else {
                    receptor = gerador.nextInt(1,7);
                    receptor2 = gerador.nextInt(1,7);
                }           
            } else if (receptor + receptor2 == 6){
                System.out.println("A banca ganhou e o jogador perdeu");
                System.out.println("Deseja jogar novamente?[S]/[N]?");
                continuar = tc.next().toUpperCase().charAt(0);
                if (continuar == 'N') {
                    online = false;
                } else {
                    receptor = gerador.nextInt(1,7);
                    receptor2 = gerador.nextInt(1,7);
                }
            } else {
                System.out.println("Nenhum resultado esperado, jogando os dados novamente");
                receptor = gerador.nextInt(1,7);
                receptor2 = gerador.nextInt(1,7);
            }
        }
    }
}
