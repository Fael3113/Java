package aula0403;

public class Exemplo02 {
    public static void main(String[] args) {
        int i = 0;
        boolean contador = true;
        while (contador){
            i++;
            System.out.println(i);
            if (i >= 50){
                contador = false;
            }
    }
    }
}