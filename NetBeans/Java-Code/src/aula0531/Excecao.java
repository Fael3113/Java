package aula0531;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        boolean booleana = false;
        Nota nt = new Nota();
        do {            
        try {
            System.out.printf("Digite uma nota: ");
            nota = entrada.nextInt();
            entrada.nextLine();
            nt.verificaNota(nota);
            booleana = true;
            } catch (InputMismatchException erro) {
                System.out.println("Nao digitou numero inteiro!");
                entrada.nextLine();
            } catch (DadosErrados e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Algo deu errado");
                entrada.nextLine();
            }    
        } while (!booleana);
        System.out.println("Valor digitado: "+nota);
    }
}
