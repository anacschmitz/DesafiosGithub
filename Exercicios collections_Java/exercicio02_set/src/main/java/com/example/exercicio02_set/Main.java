package com.example.exercicio02_set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //*Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunt por:

        //
        //Ordem de Inserção
        //
        //Ordem Natural (nome)
        //
        //IDE
        //
        //Ano de criação e nome
        //
        //Nome, ano de criacao e IDE*//

        Set<LinguagemFavorita> linguagens = new HashSet<>() {
            {
                add(new LinguagemFavorita("Java", "1991", "InteliJ"));
                add(new LinguagemFavorita("Python", "1989", "PyCharm"));
                add(new LinguagemFavorita("C#", "1999", "Visual Studio"));
            }};

        System.out.println("Ordem de inserção:");

        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>(Arrays.asList(
                        new LinguagemFavorita("Java", "1991", "InteliJ"),
                        new LinguagemFavorita("Python", "1989", "PyCharm"),
                        new LinguagemFavorita("C#", "1999", "Visual Studio")
        )
        );

        for(LinguagemFavorita linguagem : linguagens1) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoCriacao() + " - " + linguagem.getIde());

        System.out.println("Ordem Natural (NOME):");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens1);
        for(LinguagemFavorita linguagem : linguagens2) System.out.println(linguagem.getNome());

        System.out.println("Ordem Natural (IDE):");
        for(LinguagemFavorita linguagem : linguagens2) System.out.println(linguagem.getIde());

        System.out.println("Ordem Natural (ANO e NOME):");
        for(LinguagemFavorita linguagem : linguagens2) System.out.println(linguagem.getAnoCriacao() + " - " + linguagem.getNome());

        System.out.println("Ordem Natural (NOME, ANO E IDE):");
        for(LinguagemFavorita linguagem : linguagens2) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoCriacao()
        + " - " + linguagem.getIde());

        }

}
