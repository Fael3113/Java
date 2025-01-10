package aula0327;

import java.util.Scanner;

public class Exemplo09 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        boolean online = true;
        int total = 0;
        while (online) {            
            System.out.println("****Cardapio****\n"+
                               "1 - Hamburger\n"+
                               "2 - Hot-Dog\n"+
                               "3 - Fritas");
            int pedido = tc.nextInt();
            switch(pedido){
                case 1: total += 20;
                case 2: total += 15;
                case 3: total += 10;
                default: System.out.println("Selecione uma opcao valida");
                }
            System.out.println("Deseja continuar? [S]/[N]:");
            char continuar = tc.next().toUpperCase().charAt(0);
                if (continuar == 'N') {
                System.out.println("total do pedido: R$" + total);
                online = false;
            }
        }
    }
}
