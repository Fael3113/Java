package aula0417;

import java.util.Arrays;
import java.util.Random;

public class Exemplo05 {
    public static void main(String[] args) {
        var numero = new Random(); 
        int matrizA[][] = new int[2][2];
        int matrizB[][] = new int[2][2];
        int matrizAB[][] = new int[2][2];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
            matrizA[i][j] = numero.nextInt(1,11); 
            matrizB[i][j] = numero.nextInt(1,11); 
            }
        }
        for(int i=0; i<matrizAB.length; i++){
            for(int j=0; j<matrizAB[i].length; j++){
                for(int k=0; k<matrizA[i].length; k++){
                matrizAB[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(matrizA));
        System.out.println(Arrays.deepToString(matrizB));
        System.out.println(Arrays.deepToString(matrizAB));
    }
}
