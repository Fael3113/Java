package aula0515Exemplo03;

public class Funcionario extends Pessoas{
    private String cargo = "Atendente";
    private double salario = 3000;
    private String matricula = "123";

    public Funcionario(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}