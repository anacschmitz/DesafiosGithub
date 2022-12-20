package com.example.listas;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class listas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<TemperaturaMes> tempMensais = new ArrayList<TemperaturaMes>();
        DecimalFormat f = new DecimalFormat("00.0");

        for(int i = 1; i <= 6; i++ ) {
            TemperaturaMes temperaturaMes = new TemperaturaMes(i);
            System.out.println("Insira os valores de temperatura do mês " + i + ":");
            double temperatura = scan.nextDouble();
            temperaturaMes.setTemperatura(temperatura);
            tempMensais.add(temperaturaMes);
            }

        double soma = 0;
        for(TemperaturaMes temp : tempMensais){
            soma += temp.getTemperatura();
            }

        double media = (soma/ 6);
        for(TemperaturaMes temp : tempMensais) {
            if (media < temp.getTemperatura()) {
                System.out.println("Média semestral:"+ f.format(media) +"°C\nA temperatura no mês de " + temp.getNomeMes() + " foi de " + temp.getTemperatura() + "°" +
                        "C e está acima da média!");
            }
        }}
}
