package aula0508Exemplo02.personagem;

import aula0508Exemplo02.Personagem;

public class Heroi extends Personagem{
    private int mana;
    
    public Heroi(String nome, int vida, int mana) {
        super(nome, vida);
        this.mana = mana;
    }
    
    public void cumprimentar() {
        super.cumprimentar();
        System.out.println("Sou o heroi deste mundo nefasto!");
    }
}