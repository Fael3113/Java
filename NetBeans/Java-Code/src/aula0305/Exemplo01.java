package aula0305;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");
//Definição das variáveis
        Scanner teclado = new Scanner (System.in);
        String nome;
//Atribuição de valores
        nome = teclado.next();
//Visualição para o usuário
        System.out.println(nome);
    }
}
