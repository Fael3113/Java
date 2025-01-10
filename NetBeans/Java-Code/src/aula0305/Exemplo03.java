/*
 * Programa que lê e imprime na tela a soma de 2 números Double
 */
package aula0305;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double num1, num2, soma;

        System.out.println("Digite o primeiro numero");
        num1 = teclado.nextDouble();

        System.out.println("Digite o segundo numero");
        num2 = teclado.nextDouble();

        soma = num1 + num2;
        System.out.println((float)soma);
    }
}
