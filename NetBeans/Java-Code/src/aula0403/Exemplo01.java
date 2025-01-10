package aula0403;

public class Exemplo01 {
    public static void main(String[] args) throws InterruptedException{
        boolean online = true;
        int contador = 0;
        do {
            if (contador == 5){
                System.out.println("");
                online = false;
            } else {
                System.out.printf("%d\n",contador);
                contador++;
                Thread.sleep(2000);
            }    
        } while (online);
    }
}
