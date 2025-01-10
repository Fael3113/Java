package aula0320;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        System.out.println("""
                           1- Hamburguer - RS 25.00
                           2- Dogao - RS 15.00
                           3- Pizza - RS35.00
                           4- Esfirra RS 20.00
                           """);
        System.out.println("Qual o seu pedido?");
        int pedido = tc.nextInt();
        tc.close();
        switch (pedido) {
            case 1:
                System.out.println("Voce escolheu o hamburguer");
                break;
            case 2:
                System.out.println("Voce escolheu o dogao");
                break;
            case 3:
                System.out.println("Voce escolheu a pizza");
            case 4:
                System.out.println("Voce escolheu a esfirra");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
