package br.com.example.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroFeliz {

    public boolean selecionar() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean answer;

        List<Integer> numero = new ArrayList<Integer>();

        numero.add(n);
        if (n > 0) {
            if (numero.size() < 2 && n != 1) {
                answer = false;
            } else {
                do {
                    int soma = 0;

                    for (int i = 0; i <= numero.size(); i++) {
                        float x = (float) Math.pow(numero.get(i), 2);
                        soma += x;

                    }
                } while (n != 1);
            }



        }
        return answer;
    }
