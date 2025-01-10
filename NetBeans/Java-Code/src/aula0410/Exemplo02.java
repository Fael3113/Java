package aula0410;

import java.util.Random;
import java.util.Arrays;

public class Exemplo02 {
    public static void main(String[] args) {
        var gerador = new Random();
        int[] idades = new int [10];
        for (int i = 0; i < idades.length; i++){
            idades [i] = gerador.nextInt(1,11);
        }
        System.out.println("Numeros:");
        for (int idade: idades){
            System.out.print(idade + " ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(idades));
    }
}
