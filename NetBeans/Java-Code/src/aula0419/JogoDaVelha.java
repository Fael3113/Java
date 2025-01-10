package aula0419;

import java.util.Scanner;

public class JogoDaVelha {
    
    public static boolean ganhaColuna(char[][] tabuleiro) {
        boolean ganha = false;
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[0][i] == tabuleiro[1][i]) && 
                (tabuleiro[1][i] == tabuleiro[2][i]) && 
                (tabuleiro[0][i] != '-') &&
                (tabuleiro[1][i] != '-') &&
                (tabuleiro[2][i] != '-')) {
                ganha = ganha || true;
            } else {
                ganha = ganha || false;
            }
        }
        return ganha;
    }
    
    public static boolean ganhaDiag(char[][] tabuleiro) {
        boolean ganha = false;
        if ((tabuleiro[0][0] == tabuleiro[1][1]) && 
            (tabuleiro[1][1] == tabuleiro[2][2])) {
            ganha = ganha || true;
        } 
        if ((tabuleiro[2][0] == tabuleiro[1][1]) && 
            (tabuleiro[1][1] == tabuleiro[0][2])) {
            ganha = ganha || true;
        }
        return ganha;
    }
    
    public static boolean ganhaLinha(char[][] tabuleiro) {
        boolean ganha = false;
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == tabuleiro[i][1]) && 
                (tabuleiro[i][1] == tabuleiro[i][2]) && 
                (tabuleiro[i][0] != '-') &&
                (tabuleiro[i][1] != '-') &&
                (tabuleiro[i][2] != '-')) {
                ganha = ganha || true;
            } else {
                ganha = ganha || false;
            }
        }
        return ganha;
    }

    public static void mostraTabuleiro(char[][] tabuleiro) {
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void limpaTabuleiro (char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++ ) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }
    
    public static boolean testaJogada(char[][] tabuleiro, int linha, int coluna ){
        if ((linha >= 0) && (coluna >= 0) && 
            (linha < 3)  && (coluna < 3)  && 
            (tabuleiro[linha][coluna] == '-')) {
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
        mostraTabuleiro(tabuleiro);
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
        mostraTabuleiro(tabuleiro);    
    }
    
    public static void main(String[] args) {        
        char[][] tabuleiro = new char[3][3];
        boolean partida = true;
        limpaTabuleiro(tabuleiro);
        mostraTabuleiro(tabuleiro);
        do{
            jogador1(tabuleiro); 
            if (ganhaColuna(tabuleiro) || ganhaDiag(tabuleiro) || 
                ganhaLinha(tabuleiro) == false) {
                jogador2(tabuleiro);
            } else if (ganhaColuna(tabuleiro) || ganhaDiag(tabuleiro) || 
                ganhaLinha(tabuleiro) == true) {
                partida = false;
            }
        } while (partida);     
    }  
}
