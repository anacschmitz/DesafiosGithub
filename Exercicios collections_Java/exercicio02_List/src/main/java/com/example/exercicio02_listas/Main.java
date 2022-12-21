package com.example.exercicio02_listas;

public class Main {
    public static void main(String[] args) {
        Perguntas perguntar = new Perguntas();

        perguntar.perguntar();
        int x = perguntar.classificarPerguntas();

        if(x == 2){
            System.out.println("A pessoa é suspeita!");
        }else if (x == 3 | x == 4){
            System.out.println("A pessoa é Cúmplice!");
        }else if (x == 5){
            System.out.println("A pessoa é CULPADA!");
        }
        else{
            System.out.println("A pessoa é inocente!");
        }

    }
}
