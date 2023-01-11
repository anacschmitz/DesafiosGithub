package br.com.example.desafios;

import java.util.Scanner;

public class Desafio01 {
        public String desafiar() {
                Scanner leitor = new Scanner(System.in);

                int jogadaJogador = leitor.nextInt();
                int jogadaInimigo = leitor.nextInt();
                String resultado;

                if (jogadaJogador == 1 && jogadaInimigo == 2) {
                        resultado = "Perdeu";
                } else if (jogadaJogador == 2 && jogadaInimigo == 3){
                        resultado = "Perdeu";
                } else if (jogadaJogador == 3 && jogadaInimigo == 1){
                        resultado = "Perdeu";
                }else if (jogadaJogador == 1 && jogadaInimigo == 3
                        ) {
                        resultado = "Ganhou";
                } else if (jogadaJogador == 2 && jogadaInimigo == 1){
                        resultado = "Ganhou";
                } else if (jogadaJogador == 3 && jogadaInimigo == 2){
                        resultado = "Ganhou";
                }else {
                        resultado = "Empatou";
                }
                return resultado;
        }

}


