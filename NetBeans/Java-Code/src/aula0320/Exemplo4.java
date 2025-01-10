package aula0320;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Infome seu tipo sanguineo");
        String sangue = tc.next();
        
        switch (sangue){
            case "A+":
                System.out.println("Doa para A+ e AB+");
                break;
            case "A-":
                System.out.println("Doa para A+, AB+, A- e AB-");
                break;
            case "B+":
                System.out.println("Doa para B+ e AB+");
                break;
            case "B-":
                System.out.println("Doa para B+, AB+, B- e AB-");
                break;
            case "AB+":
                System.out.println("Doa para AB+");
                break;
            case "AB-":
                System.out.println("Doa para AB+ e AB-");
                break;
            case "O+":
                System.out.println("Doa para O+, A+, B+ e AB+");
                break;
            case "O-":
                System.out.println("Doa para O+, A+, B+, AB+, A-, B-, AB- e O-");
                break;                    
        }
    }
}
