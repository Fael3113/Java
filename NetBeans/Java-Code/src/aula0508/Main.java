package aula0508;

import aula0508.veiculos.Patins;
import aula0508.veiculos.Navio;
import aula0508.veiculos.Carro;

public class Main {
    public static void main(String[] args) {
        Carro fiatUno = new Carro();
        fiatUno.andarBuzinando();
        fiatUno.andar(true);
        fiatUno.getRodas();
        
        Navio pesqueiro = new Navio();
        pesqueiro.andar(true);
        
        Patins inlne = new Patins("inline", 4);
        inlne.andar(true);
        inlne.andar(false);
        
    }
}
