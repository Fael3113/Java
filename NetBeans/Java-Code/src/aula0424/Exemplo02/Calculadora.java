package aula0424.Exemplo02;

public class Calculadora {
    private double num1;
    private double num2;
    
    public double soma(double num1, double num2){
        return num1 + num2;
    }
    
    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    
    public double divisao(double num1, double num2){ 
        return num1/num2;
    }
    public double fatorial(double num1){
        if (num1==0)
            return 1;
        else
            return num1*fatorial(num1-1);
    }
}
