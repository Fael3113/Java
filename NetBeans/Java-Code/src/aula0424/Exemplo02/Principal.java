package aula0424.Exemplo02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        System.out.println("Calculadora");
        System.out.println("""
                           Escolha a opera\u00e7\u00e3o
                           1 para soma
                           2 para multiplicacao
                           3 para divisao
                           4 para fatorial""");
        int operacao = tc.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("Digite um numero");
                double num1 = tc.nextDouble();
                System.out.println("Digite outro numero");
                double num2 = tc.nextDouble();
                Calculadora adicaoCalculadora = new Calculadora();
                System.out.println(adicaoCalculadora.soma(num1, num2));
                break;
            case 2:    
                System.out.println("Digite um numero");
                num1 = tc.nextDouble();
                System.out.println("Digite outro numero");
                num2 = tc.nextDouble();
                Calculadora multiCalculadora = new Calculadora();
                System.out.println(multiCalculadora.multiplicacao(num1, num2));
                break;
            case 3:
                System.out.println("Lembre-se não se pode dividir por zero");
                System.out.println("Digite um numero");
                num1 = tc.nextDouble();
                System.out.println("Digite outro numero");
                num2 = tc.nextDouble();
                Calculadora diviCalculadora = new Calculadora();
                System.out.println(diviCalculadora.divisao(num1, num2));
                break;
            case 4:
                System.out.println("Digite um numero");
                num1 = tc.nextDouble();
                Calculadora fatoCalculadora = new Calculadora();
                System.out.println(fatoCalculadora.fatorial(num1));
            default:
                System.out.println("Operação invalida");        
            tc.close();
        }        
    }
}
