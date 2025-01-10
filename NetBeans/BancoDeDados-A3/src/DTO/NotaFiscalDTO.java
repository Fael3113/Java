package DTO;

public class NotaFiscalDTO {

    private String nome_emp, endereco_emp, dataVenda, cnpj_emp, cod_cli, cod_prod, quant_prod;
    private int numero_nota;

    public String getNome_emp() {
        return nome_emp;
    }

    public void setNome_emp(String nome_emp) {
        this.nome_emp = nome_emp;
    }

    public String getEndereco_emp() {
        return endereco_emp;
    }

    public void setEndereco_emp(String endereco_emp) {
        this.endereco_emp = endereco_emp;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCnpj_emp() {
        return cnpj_emp;
    }

    public void setCnpj_emp(String cnpj_emp) {
        this.cnpj_emp = cnpj_emp;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getQuant_prod() {
        return quant_prod;
    }

    public void setQuant_prod(String quant_prod) {
        this.quant_prod = quant_prod;
    }

    public int getNumero_nota() {
        return numero_nota;
    }

    public void setNumero_nota(int numero_nota) {
        this.numero_nota = numero_nota;
    }

}
