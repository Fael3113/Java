package aula0531;

public class Nota {
    private double[] lstNotas;

    public Nota() {}
    
    public boolean verificaNota(double nota) throws DadosErrados{
        if((nota < 0) || (nota > 10)){
            throw new DadosErrados("nota incorreta");
        }
        return true;      
    }

}
