package aula0327;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double peso;
        String multa;
        System.out.println("Quantos quilos de peixe voce trouxe?");
        peso = tc.nextDouble();
        multa = (peso <=50)? "Sem multa" : "Multa de RS" + (peso-50)*4;
        System.out.println(multa);
    }
}
