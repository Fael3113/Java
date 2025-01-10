package aula0508;

public class Veiculo {
    private String tipoDeCarga = "Pessoas";
    
    public void andar(boolean paraFrente){
        if (paraFrente) {
            System.out.println("Esta andando para frente");
        } else {
            System.out.println("Andando para tras");
        }
    }
    
}
