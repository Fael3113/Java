package aula0508.veiculos;

import aula0508.Veiculo;

public class Patins extends Veiculo {
    
    public String categoria = "tradicional";
    public int rodas = 8;
    
    public Patins(String categoria, int par){
        if(categoria.equalsIgnoreCase("gelo")){
            this.rodas = 0;
        } else {
            this.rodas = rodas;
        }
    }
}
