package aula0327;

import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        boolean online = true;
        double total = 200;
        while (online) {            
            System.out.println("****Item-Valor****\n"+
                               "1 - 239.99\n"+
                               "2 - 129.75\n"+
                               "3 - 99.95\n"+
                               "4 - 350.89\n" );
            int comissao = tc.nextInt();
            switch(comissao){
                case 1: 
                    System.out.println("Quantas itens foram vendidos?");
                    int vendidas1 = tc.nextInt();
                    total += 21.59 * vendidas1;
                    System.out.println("Adicionada comissao ao salario");
                    break;
                case 2:
                    System.out.println("Quantas itens foram vendidos?");
                    int vendidas2 = tc.nextInt();
                    total += 11.67 * vendidas2;
                    System.out.println("Adicionada comissao ao salario");
                    break;
                case 3:
                    System.out.println("Quantas itens foram vendidos?");
                    int vendidas3 = tc.nextInt();
                    total += 8.99 * vendidas3;
                    System.out.println("Adicionada comissao ao salario");
                    break;
                case 4:
                    System.out.println("Quantas itens foram vendidos?");
                    int vendidas4 = tc.nextInt();
                    total += 31.58 * vendidas4 ;
                    System.out.println("Adicionada comissao ao salario");
                    break; 
                default: System.out.println("Selecione uma opcao valida");
                }
            System.out.println("Deseja continuar? [S]/[N]:");
            char continuar = tc.next().toUpperCase().charAt(0);
                if (continuar == 'N') {
                System.out.printf("Total do salario: R$ %.2f\n", total);
                online = false;
            }
        }
    }
}