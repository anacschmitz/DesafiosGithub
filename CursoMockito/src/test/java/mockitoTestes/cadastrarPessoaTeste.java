package mockitoTestes;

import br.com.dio.mockito.ApiDosCorreios;
import br.com.dio.mockito.CadastrarPessoa;
import br.com.dio.mockito.DadosLocalizacao;
import br.com.dio.mockito.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class cadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SC", "Palhoça", "Rua Manoel Garcia", "casa", "Aririu");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("88135-240")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Ana", "78745548", LocalDate.now(),"88135-240");

        assertEquals("Ana", pessoa.getNome());
        assertEquals("SC", pessoa.getEndereco().getUf());
        assertEquals("casa", pessoa.getEndereco().getComplemento());


    }

}
