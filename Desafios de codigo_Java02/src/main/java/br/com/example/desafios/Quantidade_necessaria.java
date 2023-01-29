package br.com.example.desafios;

import java.util.Scanner;

public class Quantidade_necessaria {

    public int quantidadeDePizzas(){
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();
    int count = 1;
    int X = 0;
    int qtdPizza =0;
    int N = 0;

        while (count <= T) {
            N = scanner.nextInt();
            X = scanner.nextInt();
            count += 1;

            if((X*N) % SLICE == 0){
                qtdPizza = (X*N) / SLICE;
            }else{
                qtdPizza = ((X*N)/ SLICE) + 1;
            }
            System.out.println(qtdPizza);
        }
    return qtdPizza;
    }


}
