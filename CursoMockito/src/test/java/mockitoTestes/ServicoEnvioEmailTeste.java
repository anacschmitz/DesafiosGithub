package mockitoTestes;

import br.com.dio.mockito.Email;
import br.com.dio.mockito.Formato;
import br.com.dio.mockito.PlataformaDeEnvio;
import br.com.dio.mockito.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {
    @Mock
    public PlataformaDeEnvio plataforma;

    @InjectMocks
    public ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> emailCaptor;

    @Test
    public void validaSeEmailEstaComDadosCorretos() {

        String email = "jose.alve@provedor.com";
        String mensagem = "Mensagem de Teste 123";

        servico.enviaEmail(email, mensagem, true);
        Mockito.verify(plataforma).enviaEmail(emailCaptor.capture());

        Email emailCapturado = emailCaptor.getValue();
        Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());
    }

}
