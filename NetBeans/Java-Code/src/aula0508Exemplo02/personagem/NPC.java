package aula0508Exemplo02.personagem;

import aula0508Exemplo02.Personagem;

public class NPC extends Personagem{
    public String profissao;
    
    public NPC(String nome, int vida, String profissao){
        super(nome, vida);
        this.profissao = profissao;
 
    }
    
}
