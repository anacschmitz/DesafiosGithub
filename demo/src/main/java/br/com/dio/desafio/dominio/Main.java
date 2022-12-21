package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo cursoJava = new Curso("POO com Java", 4);
        cursoJava.setDescricao("Introdução à programação orientada a objetos");

        Conteudo cursoQA = new Curso("Fundamentos de Qualidade de Software", 4);
        cursoQA.setDescricao("Curso introdutório sobre a área de qualidade de software");

        Mentoria mentoria1 = new Mentoria("Teste de Perfomance em Aplicação Web com JMeter", LocalDate.now());
        mentoria1.setDescricao("Live com a professora Camila Louzada");

        Mentoria mentoria2 = new Mentoria("Conhecendo Testes de Acessibilidade Digital", LocalDate.now());
        mentoria1.setDescricao("Live com as professoras Janaina Joyce da Silva e Flavia Martins Bertotti");


        Bootcamp bootcampQA = new Bootcamp();

        bootcampQA.setNome("GFT Quality Assurance Para Mulheres");
        bootcampQA.setDescricao("Bootcamp direcionados a formação de novas integrantes da equipe GFT");
        bootcampQA.getConteudos().add(cursoQA);
        bootcampQA.getConteudos().add(cursoJava);
        bootcampQA.getConteudos().add(mentoria1);
        bootcampQA.getConteudos().add(mentoria2);

        Dev dev1 = new Dev("Ana Carolina Schmitz");
        dev1.increverNoBootcamp(bootcampQA);
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos().toString());
        dev1.progredir();
        dev1.progredir();

        System.out.println("----------");
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos().toString());
        System.out.println("Conteudos Concluídos: " + dev1.getConteudosCooncluidos().toString());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("----------");

        Dev dev2 = new Dev("Letícia de Souza");
        dev2.increverNoBootcamp(bootcampQA);
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos().toString());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("----------");
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos().toString());
        System.out.println("Conteudos Concluídos: " + dev2.getConteudosCooncluidos().toString());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}
