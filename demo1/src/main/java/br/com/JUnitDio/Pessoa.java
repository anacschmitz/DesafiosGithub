package com.example.demo1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private LocalDate idade;
    private String  nome;

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, LocalDate idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public int comparaIdade(){
        return (int) ChronoUnit.YEARS.between(this.idade, LocalDate.now());
    }

    public boolean ehMaiorDeIdade(){
        return comparaIdade() >= 18;
    }
}
