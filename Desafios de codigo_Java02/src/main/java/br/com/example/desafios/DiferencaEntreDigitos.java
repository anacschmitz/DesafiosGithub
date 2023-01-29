package br.com.example.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DiferencaEntreDigitos {

    public int diferenca(){
    int diferenca = 0;

    Scanner scan = new Scanner(System.in);
    int numero = scan.nextInt();

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

    int soma = Arrays.stream(ints).sum();

    int produto =1;
    for(int x : ints){
        produto *= x;
    }
        return produto - soma;
    }
}
