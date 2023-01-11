package br.com.example.desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumeroFeliz {

    public boolean selecionar() {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        boolean answer = false;

        if (numero == 1) {
            answer = true;
        }else if (String.valueOf(numero).length() >=2) {
            while (numero != 1 & String.valueOf(numero).length() >=2) {
                String numeroEmString = String.valueOf(numero);
                String[] split = numeroEmString.split("");

                int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();
                List<Integer> lista = new ArrayList<>();

                for (int i : ints) {
                    int potencia = (i * i);
                    lista.add(potencia);
                }
                numero = lista.stream().mapToInt(Integer::intValue).sum();
            }
            if (numero == 1) answer = true;
            else answer = false;
        }
        return answer;

    }
    }
