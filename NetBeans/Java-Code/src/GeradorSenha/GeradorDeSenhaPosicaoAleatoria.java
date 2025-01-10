package GeradorSenha;

import java.util.Scanner;

public class GeradorDeSenhaPosicaoAleatoria {

    public static String gerarSenhaAleatoria() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o numero de caracteres da senha");
        int qtdeMaximaCaracteres = tc.nextInt();
        String[] caracteres = { "0", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z", "!", "@", "#", "$", "%", "&", "*", 
            "-", "_", "=", "+", "/", "?", "|", "<", ">" };
      
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(gerarSenhaAleatoria());
    }
    
}

