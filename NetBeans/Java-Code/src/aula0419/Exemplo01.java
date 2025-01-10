package aula0419;
    
import java.util.Scanner;

public class Exemplo01 {
    
    public static void limparTabuleiro(char[][] tabuleiro){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                tabuleiro[i][j] = '-';
            }
        }
    } 
    
    public static void mostrarTabuleiro(char [][] tabuleiro){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static boolean testaJogada(char[][] tabuleiro, int linha, int coluna){
        if((linha < 3 && linha >= 0) && (coluna < 3 && coluna >= 0) && (tabuleiro[linha][coluna] == '-')){
            return true;
        } else {
            return false;
        }
    }  
    
    public static void jogador1(char[][] tabuleiro) {
        var tc = new Scanner(System.in);
        int linha;
        int coluna;
        do {
            System.out.println("Primeiro Jogador");
            System.out.println("Digite a posição linha (de 0 a 2)");
            linha = tc.nextInt();
            System.out.println("Digite a posição coluna (de 0 a 2)");
            coluna = tc.nextInt();
            System.out.println("Sua rodada terminou");
        } while (!testaJogada(tabuleiro, linha, coluna));
        tabuleiro[linha][coluna] = 'x';
        mostrarTabuleiro(tabuleiro);
    }
    
    public static void jogador2(char [][] tabuleiro) {
        var tc = new Scanner(System.in);
        int linha;
        int coluna;
        do {
            System.out.println("Segundo jogador");
            System.out.println("Digite a posição linha (de 0 a 2)");
            linha = tc.nextInt();
            System.out.println("Digite a posição coluna (de 0 a 2)");
            coluna = tc.nextInt();
            System.out.println("Sua rodada terminou");
        } while (!testaJogada(tabuleiro, linha, coluna));
        tabuleiro[linha][coluna] = 'o';
        mostrarTabuleiro(tabuleiro);
    }
    
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        var tc = new Scanner(System.in);
        boolean parar = true;
        limparTabuleiro(tabuleiro);
        mostrarTabuleiro(tabuleiro);
        while (parar){
            System.out.println("Bem vindo ao Jogo da Velha");
            System.out.println("Regras:");
            System.out.println("Digite 4 caso o vencedor seja o jogador 1");
            System.out.println("Digite 5 caso o vencedor seja o jogador 2");
            System.out.println("Digite 6 caso seja empate");
            System.out.println("Após cada jogada, digite um numero aleatorio\n" +
                                "diferente aos indicados caso não houver vencendor");
            jogador1(tabuleiro);
            jogador2(tabuleiro);
            System.out.println("Alguem venceu?");
            int vencedor = tc.nextInt();
            switch (vencedor){
                case 4:
                    System.out.println("O vencedor é o jogador 1 com x");
                    parar = false;
                    break;
                case 5:
                    System.out.println("O vencedor é o jogador 2 com o");
                    parar = false;
                    break;
                case 6:
                    System.out.println("Deu empate");
                    parar = false;
                    break;
                default: System.out.println("Proxima rodada");
            }
        } 
    }
}
