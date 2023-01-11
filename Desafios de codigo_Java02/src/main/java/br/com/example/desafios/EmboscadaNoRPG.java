package br.com.example.desafios;

import java.util.Scanner;

public class EmboscadaNoRPG {

    public String calcularResultado() {
        Scanner leitor = new Scanner(System.in);
        String resultado = "A";

        int dados = leitor.nextInt();
        int vidaDoJogador = leitor.nextInt();
        int ataqueDoJogador = leitor.nextInt();
        int defesaDoJogador = leitor.nextInt();
        int vidaDoInimigo = leitor.nextInt();
        int ataqueDoInimigo = leitor.nextInt();

        if (dados >= 8 & dados <= 10) {
            dados *=2;
        }

        int danoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));


        if (danoJogador <= 0){
            resultado = "Jogador nao sobreviveu";
        }else{
            int danoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);
            if(danoInimigo <= 0){
                resultado = "Jogador sobreviveu e derrotou o inimigo";
            }else{
                resultado = "Jogador sobreviveu e nao derrotou o inimigo";
            }


        }


    return resultado;
    }


}
