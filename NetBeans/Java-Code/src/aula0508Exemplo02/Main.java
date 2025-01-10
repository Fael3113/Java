package aula0508Exemplo02;

import aula0508Exemplo02.personagem.Heroi;
import aula0508Exemplo02.personagem.NPC;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        Heroi berto = new Heroi("Joao", 20, 10);
        NPC ferreiro = new NPC("Ana", 10, "ferreiro");
    }
}
