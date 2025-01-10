package aula0417;

import java.util.Arrays;
import java.util.Random;

public class Exemplo04 {
    public static void main(String[] args) {
        int[][] nomes = new int[2][2];
        int[][] nomes2 = new int[2][2];
        int[][] nomes3 = new int[2][2];
        var numero = new Random();
        for (int rua = 0; rua < nomes.length; rua++){ //Entra na Matriz
            for (int num = 0; num < nomes[0].length; num++){ //Entra no vetor
                nomes [rua][num] = (numero.nextInt(1,11));
                nomes2 [rua][num] = (numero.nextInt(1,11));
                nomes3 [rua][num] = nomes[rua][num] + nomes2 [rua][num];
            }
        }
        System.out.println(Arrays.deepToString(nomes));
        System.out.println(Arrays.deepToString(nomes2));
        System.out.println(Arrays.deepToString(nomes3));
    }
}
