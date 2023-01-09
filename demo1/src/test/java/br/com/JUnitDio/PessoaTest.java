package com.example.demo1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    public void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(23, jessica.comparaIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
    }
//        Pessoa joao = new Pessoa("João", LocalDate.now());
//       // Assertions.assertFalse(joao.ehMaiorDeIdade());
//    }
//
//    @Test
//    void validaIgualdade() {
//        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDate.now());
//        Assertions.assertSame(pessoa, pessoa);
//    }
}
