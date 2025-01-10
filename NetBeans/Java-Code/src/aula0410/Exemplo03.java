package aula0410;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        var tc = new Scanner(System.in);
        System.out.println("Digite o numero de idades que pretende colocar");
        int x = tc.nextInt();
        int aux;
        int[] num = new int[x];
        double soma = 0;        
        for (int i = 0; i < num.length; i++) { 
        System.out.println("Numero: "); 
        num[i] = tc.nextInt(); 
        soma += num[i];
        } 
        tc.close();
        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[j] < num[i]){
                    aux = num[j];
                    num[j] = num[i];
                    num[i] = aux;
                }
            }    
        }
        if (num.length % 2 == 0){
            int n = x/2;
            System.out.println("Mediana = " + (num[n-1]+ num[n])/2);
        } else {
            int n = x/2;
            System.out.println("Mediana = " + num[n]);
        }
        System.out.println("Media = " + (soma/num.length));
    }
}
