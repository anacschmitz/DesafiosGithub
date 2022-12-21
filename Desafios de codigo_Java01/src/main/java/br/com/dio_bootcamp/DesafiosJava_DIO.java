package br.com.dio_bootcamp;
import java.text.DecimalFormat;
import java.util.Scanner;


public class DesafiosJava_DIO {
    public static void main(String[] args) {
        turno();

        filaBanco();

        percentualDesconto();

        menorMultiplo();
    }

    public static void turno() {
        /*DESAFIO Qual é o seu turno?*/
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia!");
        } else if (turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public static void filaBanco() {
        /*DESAFIO A fila do banco*/

        String[] nomesFila = new String[3];
        Scanner adicionar = new Scanner(System.in);
        int posicao = 0;

        for (int i = 0; i < nomesFila.length; i++) {
            String nome = adicionar.next();
            nomesFila[i] = String.valueOf(nome);
        }

        for (String nome : nomesFila) {
            posicao += 1;
            System.out.println(nome + "- está na posição: " + posicao);

        }
    }

    public static void percentualDesconto() {
        /*DESAFIO Encontrando o Percentual do Desconto*/

        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();
        DecimalFormat f = new DecimalFormat("0");

        float diferenca = (M - S);
        float desconto = ((diferenca * 100) / M);
        System.out.println("O desconto foi de " + f.format(desconto) + "%");
    }

    public static void menorMultiplo() {
        /*DESAFIO Descubra o Menor Multiplo*/

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        ///TODO: Crie as outras condições necessárias para a resolução do desafio.

        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
            minimoMultiplo = numero;

        } else {
            minimoMultiplo = numero * 2;
        }

        System.out.println("O resultado eh:" + minimoMultiplo);
    }

}

