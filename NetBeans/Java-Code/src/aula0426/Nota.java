package aula0426;

public class Nota {
    private double[] lstNotas;

    public Nota() {
        this.lstNotas = new double[3];
        for(int i = 0; i < 3; i++){
            this.lstNotas[i] = 0;
        }
    }
    
    public Nota(double [] lstNotas){
        this.lstNotas = lstNotas;
    }

    public double getNotasA1(){
        return this.lstNotas[0];
    }
    
    public double getNotasA2(){
        return this.lstNotas[1];
    }
    
    public double getNotasA3(){
        return this.lstNotas[2];
    }
    
    public Double getNota(int atividade){
        if (this.verificaAtividade(atividade)) {
            return this.lstNotas[atividade];
        } else {
            return null;
        }
    }
    /*
    public double getNota(int atividade){
        if ((atividade >= 1 ) && (atividade <=3)) {
            return this.lstNotas[atividade];
        } else {
            return -1;
        }
    }
    */
    public double[] getNota(){
        return this.lstNotas;
    }

    public boolean setNota(double nota, int atividade){
        if (this.verificaAtividade(atividade)){
            if (this.verificaNota(nota)) {
                this.lstNotas[atividade] = nota;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }  
    }
    
    public boolean verificaNota(double nota){
        if((nota >= 0) && (nota <= 10)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean verificaAtividade (int atividade){
        if((atividade >= 1) || (atividade <= 3)){
            return true;
        } else {
            return false;
        }
    }
    
    public double calcMedia() {
        return this.lstNotas[0] * 0.3 + this.lstNotas[1] * 0.3 + this.lstNotas[2] * 0.4;
    }
    
    public void print(){
        System.out.println("Nota A1 = "+this.lstNotas[0]);
        System.out.println("Nota A2 = "+this.lstNotas[1]);
        System.out.println("Nota A3 = "+this.lstNotas[2]);
    }
}
