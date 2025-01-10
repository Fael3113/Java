package CalculadoraSenoCossenoTangente;

public class Calculadora {
    
    private double num1;

    public Calculadora(double num1) {
        this.num1 = num1;
    }
    
    public float radiano(double num1){
        return (float)Math.toRadians(num1);
    }
    
    public void resultado (double radiano){
        if(num1 == 90){
            System.out.printf("Seno: %.2f\n",(float)Math.sin(radiano));
            System.out.printf("Cosseno: 0\n");
            System.out.printf("Tangente: 0\n");
        } else {
        System.out.printf("Seno: %.2f\n",(float)Math.sin(radiano));
        System.out.printf("Cosseno: %.2f\n",(float)Math.cos(radiano));
        System.out.printf("Tangente: %.2f\n",(float)Math.tan(radiano));
        }
    }
}
