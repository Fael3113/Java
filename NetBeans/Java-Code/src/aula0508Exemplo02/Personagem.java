package aula0508Exemplo02;

public class Personagem {
    // ATRIBUTOS
    public int vida; // Vida do personagem
    public String nome; // Nome do personagem
    private boolean atacavel = false;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }
    
    // MÉTODOS
    public void cumprimentar() {
        System.out.println("Ola, meu nome eh " + this.nome);
    }
}