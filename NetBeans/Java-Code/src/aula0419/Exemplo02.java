package aula0419;

import java.util.Scanner;

public class Exemplo02 {
    
    public static int[][] preencherMatriz(int[][] cidades){
        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < cidades[0].length; i++){ 
            for (int j = i+1; j < cidades[0].length; j++){ 
                System.out.printf("\nInforme o km da cidade %d para %d: ",i,j);
                cidades [i][j] = tc.nextInt();
                cidades [j][i] = cidades [i][j];
            }
        }  
        return cidades;
    }
    
    public static void imprimeCidade(int[][] cidades) {
        for(int i = 0; i < cidades.length; i++){
            for(int j = 0; j < cidades.length; j++){
                System.out.printf("\t%d", cidades[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static int calcKM(int [] cidade, int[][] cidades){
        int km = 0;
        int origem = 0;
        int destino = 0;
        for(int i = 0; i < cidade.length -1; i++){
            origem = cidade[i]-1;
            destino = cidade[i+1]-1;
            km = km + cidades [origem][destino];
        }
        return km;
    }
    
    public static void main(String[] args) {
        int[][] cidades= new int [5][5];
        int[] itinerario = {1,2,3,4,5};
        cidades = preencherMatriz(cidades);
        imprimeCidade(cidades);
        int km = calcKM(itinerario, cidades);
        System.out.println(km);
    }
}       
