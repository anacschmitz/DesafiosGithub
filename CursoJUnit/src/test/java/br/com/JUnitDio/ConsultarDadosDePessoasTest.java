package br.com.JUnitDio;

import org.junit.Test;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoasTest {
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    public void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000, 1, 15)));
    }

    @AfterEach
    public void removeDadosParaTeste(){
        BancoDeDados.removerDados(new Pessoa("João", LocalDate.of(2000, 1, 15)));
    }

    @Test
    public void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.iniciarConexao();
    }



}
