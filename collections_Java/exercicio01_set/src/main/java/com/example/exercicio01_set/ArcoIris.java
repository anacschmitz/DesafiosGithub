package com.example.exercicio01_set;

import com.sun.javafx.scene.shape.LineToHelper;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {

    Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "amarelo", "violeta", "azul-claro", "verde", "azul-escuro"));
    // A: Exiba todas as cores uma abaixo da outra
        for(String cor : arcoIris){
            System.out.println(cor);
        }

    // B: A quantidade de cores que o arco-íris tem
    System.out.println("O arcoíris contem "+ arcoIris.size() + " cores");

    // C: Exiba as cores em orgem alfabética
    Set<String> arcoIris2 = new TreeSet<>(arcoIris);
    System.out.println("As cores em ordem alfabética:\n" + arcoIris2);

    //D: Exiba as cores na ordem inversa do que foi informada
        Set<String> arcoIris3 = new TreeSet<>(Collections.reverseOrder());
        arcoIris3.addAll(arcoIris2);
        System.out.println("As cores na ordem inversa ao que forma inseridas: "+ arcoIris3);

    //E: Exiba todas as cores que começam com a letra ”v”

        for(String cor : arcoIris){
            if(cor.startsWith("v")) {
                System.out.println("A cor " + cor +" começa com a letra v");
            }
        }

    //F: Exclua todas as cores que iniciam com a letra "v"
        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(arcoIris);

   // G: Limpe o Conjunto
        arcoIris.clear();

   // H: Confira se o conjunto está vazio
        System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());

}
}
