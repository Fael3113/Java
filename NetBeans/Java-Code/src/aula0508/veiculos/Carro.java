package aula0508.veiculos;

import aula0508.Veiculo;

public class Carro extends Veiculo{
    public final int rodas = 4;
    public double motorizacao = 1;
    public double potencia = 65;
    public String combustivel = "Gasolina";
    
    public void getRodas(){
        System.out.println("Tenho "+rodas+" rodas");
    }
    
    public void andarBuzinando(){
        super.andar(true);
        System.out.println("Tambem estou buzinando");
    }
    
}
