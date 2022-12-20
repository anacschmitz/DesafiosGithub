package com.example.exercicio01_map;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        System.out.println("Criando um dicionário");
        Map<String, Long> populacaoEstado = new HashMap<>(){{
            put("PE", 9616621L);
            put("Al", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }
        };

        System.out.println(populacaoEstado.toString());

        System.out.println("Substituindo o valor:");
        populacaoEstado.put("RN", 3534165L);
        System.out.println(populacaoEstado.toString());

        System.out.println("Conferindo se o estado PB esta incluso no dicionário: " + populacaoEstado.containsKey("PB"));

        boolean conferir = populacaoEstado.containsKey("PB");
        if(conferir == false) populacaoEstado.put("PB", 4039277L);

        System.out.println(populacaoEstado.toString());


        System.out.println("Ordem de Inserção");

        Map<String, Long> populacaoEstado1 = new LinkedHashMap<>(){{
            put("PE", 9616621L);
            put("Al", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }
        };
        for(Map.Entry<String, Long> estado : populacaoEstado1.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue());

        System.out.println("Ordem Alfábetica");
        Map<String, Long> populacaoEstado2 = new TreeMap<>(populacaoEstado1);
        for(Map.Entry<String, Long> estado : populacaoEstado2.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue());

    }
}
