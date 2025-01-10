package aula0417;

public class Exemplo01 {
    public static void main(String[] args) {
        String[] vendedores = {"Joao", "Felipe", "Bertine", "Fabiano", "Soraia"};
        int[] vendas = {1100, 500, 1500, 750, 50};
        int meta = 1000;
        int cont = 0;
        for (int venda: vendas){
            if (venda >= meta *1.1){
                System.out.println(vendedores[cont] + " bateu a meta acima de 10%");
            } else if (venda >= meta){
                System.out.println(vendedores[cont] + " bateu a meta abaixo de 10%");
            } else {
                System.out.println(vendedores[cont] + " não bateu a meta");
            }
            cont++;
        }
    }
}
