package aula0607;

public interface InterfaceListas {
    
    public boolean inserir(double valor);
    public boolean inserir(int pos, double valor) throws ErrosListas;
    
    public boolean remover(int pos);
    public boolean remover();
    
    public double ler(int pos);
    public double ler();
    
    public void print();
    
    public String toString();
    
    public int lenght();
    
}
