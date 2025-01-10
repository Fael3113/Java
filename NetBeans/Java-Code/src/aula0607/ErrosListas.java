package aula0607;

public class ErrosListas extends Exception{
    private String mensagem;

    public ErrosListas(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
