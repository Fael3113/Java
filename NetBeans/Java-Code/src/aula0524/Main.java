package aula0524;

public class Main {
    public static void main(String[] args) {
        Aluno rafa = new Aluno();
        System.out.println(rafa.getNome());
        System.out.println(rafa.getRa());
        
        Aluno pedro = new Aluno("Pedro", 1232, "Rua 4343", 6665);
        pedro.print();
        
    }
}
