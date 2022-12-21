package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate dataMentoria;

    public Mentoria(String titulo, LocalDate dataMentoria) {
        super.setTitulo(titulo);
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }
}

