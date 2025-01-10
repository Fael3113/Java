package aula0327;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double num1, num2;
        for(int i = 0; i < 3; i++){
            System.out.println("Insira um numero");
            num1 = tc.nextDouble();
            System.out.println("Insirra outro numero");
            num2 = tc.nextDouble();
            System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
            System.out.println("------------");
        }
    }
}
