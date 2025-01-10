package aula0524;

public abstract class Pessoa {
    private String nome;
    private int cpf;
    private String endereco;
    
    public Pessoa(String nome, int cpf, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;        
    }
    
    public Pessoa(){
        this.nome = "Ze";
        this.endereco = "123";
        this.cpf = 9999;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public boolean entrar(int codigo){
        return false;
    }
    
    public boolean sair(int codigo){
        return false;
    }
    
    public String titulo(){
        return "Pessoa";
    }
}
