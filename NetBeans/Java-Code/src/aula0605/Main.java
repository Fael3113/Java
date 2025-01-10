package aula0605;

public class Main {
     public static void main(String[] args) {
        
        Setor ti = new Setor("TI");
        Setor adm = new Setor("Adm");
        Setor jur = new Setor("Juridico");
        Setor manuntecao = new Setor("Manutenção");
        
        Funcionario joao = new Funcionario("Joao");
        ti.addFuncionario(joao);
        adm.addFuncionario(joao);
                
        Funcionario felipe = new Funcionario("Felipe");
        ti.addFuncionario(felipe);
        jur.addFuncionario(felipe);
        
        Funcionario breno = new Funcionario("Breno");
        ti.addFuncionario(breno);
        manuntecao.addFuncionario(breno);
        
        Funcionario paloma = new Funcionario("Paloma");     
        ti.addFuncionario(paloma);
        jur.addFuncionario(paloma);
        
        System.out.println("Pessoas do setor de TI:");
        for (Funcionario f: ti.funcionarios) {
            System.out.println(f.getNome());
        }
        
        System.out.println("Setores da Joao:");
        for (Setor s: joao.setores) {
            System.out.println(s.getNome());
        }
        
        System.out.println("Setores da Felipe:");
        for (Setor s: felipe.setores) {
            System.out.println(s.getNome());
        }
        
        System.out.println("Setores da Breno:");
        for (Setor s: breno.setores) {
            System.out.println(s.getNome());
        }
        
        System.out.println("Setores da Paloma:");
        for (Setor s: paloma.setores) {
            System.out.println(s.getNome());
        }
      
    }
}
