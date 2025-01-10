package aula0607;

public class VetorLista implements InterfaceListas{
    private double[] vetor;
    private int tamLista;

    public VetorLista() {
        vetor = new double[100];
        this.tamLista = 0;
    }
    
        
    @Override
    public boolean inserir(double valor) {
        if (tamLista < 99) {
            this.vetor[tamLista] = valor;
            this.tamLista++;
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean inserir(int pos, double valor) throws ErrosListas{
        if (pos == (this.tamLista+1)) {
            this.vetor[tamLista] = valor;
            this.tamLista++;
            return true;
        } else if (pos >= 0 && pos <= (this.tamLista+1)) {
            for(int i = this.tamLista; i > pos; i--){
                this.vetor[i + 1] = this.vetor[i];
            }
            this.vetor[pos] = valor; 
            return true;
        } else {
            throw new ErrosListas("Posicao incorreta");
        }
        
    }

    @Override
    public boolean remover(int pos) {
        return true;
    }

    @Override
    public boolean remover() {
        return true;
    }

    @Override
    public double ler(int pos) {
        return 0;
    }

    @Override
    public double ler() {
        return 0;
    }

    @Override
    public void print() {
        for (int i = 0; i < lenght(); i++) {
            System.out.println("Elemento ["+i+"] = "+this.vetor[i] );
        }
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    @Override
    public int lenght(){
        return this.tamLista;
    }
}
