package aula0426;

public class AlunoPSC {
    private String nome;
    private int RA;
    private Nota notaAluno;
    private double mediaAluno;
    
    public AlunoPSC (String nome, int RA) {
        this.nome = nome;
        this.RA = RA;
        notaAluno = new Nota();
        
    }
    
    public boolean lancaNota(double nota, int atividade) {
        return this.notaAluno.setNota(nota, atividade);
    }
    
    
    public double leNota(int atividade) {
        return this.notaAluno.getNota(atividade);
    }
    
    public double media () {
        this.mediaAluno = this.notaAluno.calcMedia();
        return this.mediaAluno;
    }
    
    public void print() {
        System.out.println(this.nome);
        System.out.println(this.RA);
        System.out.println(this.notaAluno.getNota(1));
        System.out.println(this.notaAluno.getNota(2));
        System.out.println(this.notaAluno.getNota(3));
        System.out.println("-----------------------");
    }
    
}
