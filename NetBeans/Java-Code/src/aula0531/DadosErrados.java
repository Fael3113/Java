package aula0531;

public class DadosErrados extends Exception{
    
    private String mensagem;
    
    public DadosErrados(){
        this.mensagem = "Acorda que esta errado";
    }
    
    public DadosErrados(String mensagem){
        this.mensagem = mensagem;
    }
    
    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
