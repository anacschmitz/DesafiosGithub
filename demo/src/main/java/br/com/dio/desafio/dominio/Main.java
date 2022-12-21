package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("POO com Java", 4);
        cursoJava.setDescricao("Introdução à programação orientada a objetos");

        Curso cursoQA = new Curso("Fundamentos de Qualidade de Software", 4);
        cursoQA.setDescricao("Curso introdutório sobre a área de qualidade de software");

        Mentoria mentoria1 = new Mentoria("Teste de Perfomance em Aplicação Web com JMeter", LocalDate.now());
        mentoria1.setDescricao("Live com a professora Camila Louzada");

        Mentoria mentoria2 = new Mentoria("Conhecendo Testes de Acessibilidade Digital", LocalDate.now());
        mentoria1.setDescricao("Live com as professoras Janaina Joyce da Silva e Flavia Martins Bertotti");
    }
}
