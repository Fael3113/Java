package aula0524;

public class Aluno extends Pessoa{
    
    private int ra;
    
    public Aluno(){
        super();
        this.ra = 1231231;
    }
    
    public Aluno(String nome, int cpf, String endereco, int ra){
        super(nome, cpf, endereco);
        this.ra = ra;
    }

    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    @Override
    public boolean entrar(int codigo){
        if (codigo == ra) {
            System.out.println("Entrada");
            return true;
        } else {
            System.out.println("Nao autorizou a entrada");
            return false;
        }
    }
    
    @Override
    public boolean sair(int codigo){
        if (codigo == ra) {
            System.out.println("Saida");
            return true;
        } else {
            System.out.println("Nao autorizou a saida");
            return false;
        }
    }

    @Override
    public String titulo(){
        return "Aluno";
    }
    
    public void print(){
        System.out.println("Titulo: "+this.titulo());
        System.out.println("Nome: "+super.getNome());
        System.out.println("CPF: "+super.getCpf());
        System.out.println("Endereco: "+super.getEndereco());
        System.out.println("RA: "+this.getRa());
    }
}
