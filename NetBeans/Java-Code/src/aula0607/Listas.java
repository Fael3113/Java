package aula0607;

public class Listas {
    public static void main(String[] args) {
        VetorLista lst = new VetorLista();
        lst.inserir(7);
        lst.inserir(56);
        lst.inserir(434);
        
        try {
            lst.inserir(1, 45);
        } catch (ErrosListas e) {
            System.out.println(e.getMensagem());
        }
        
        lst.print();
    }
}
