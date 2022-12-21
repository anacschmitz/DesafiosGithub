package com.example.exercicio02_listas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Perguntas {
    private ArrayList<String> respostas = new ArrayList<>();


    public void perguntar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String answer1 = scan.next().toLowerCase();
        respostas.add(answer1);

        System.out.println("Esteve no local do crime?");
        String answer2 = scan.next().toLowerCase();
        respostas.add(answer2);

        System.out.println("Mora perto da vítima?");
        String answer3 = scan.next().toLowerCase();
        respostas.add(answer3);

        System.out.println("Devia para a vítima?");
        String answer4 = scan.next().toLowerCase();
        respostas.add(answer4);

        System.out.println("Já trabalhou com a vítima?");
        String answer5 = scan.next().toLowerCase();
        respostas.add(answer5);

    }

    public int classificarPerguntas(){
        int sim = 0;

        for(int i = 0; i < 5; i++){
            if (respostas.get(i).contains("s")) {
                sim += 1;
            }
        }
        return sim;

    }
}
