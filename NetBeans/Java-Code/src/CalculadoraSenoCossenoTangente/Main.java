package CalculadoraSenoCossenoTangente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite seu angulo");
        float num1 = tc.nextFloat();
        Calculadora calc = new Calculadora(num1);
        float radiano = calc.radiano(num1);
        calc.resultado(radiano);

    } 
}
