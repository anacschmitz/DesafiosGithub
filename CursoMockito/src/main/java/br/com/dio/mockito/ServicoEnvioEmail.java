package br.com.dio.mockito;

public class ServicoEnvioEmail {
    private PlataformaDeEnvio plataforma2;

    public void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {

        Email email = null;

        if(formatoHtml) {
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        }else{
            email = new Email(enderecoEmail, mensagem, Formato.TEXTO);
        }

        this.plataforma2.enviaEmail(email);
    }

    public PlataformaDeEnvio getPlataforma() {
        return plataforma2;
    }
}
