package br.com.dio.desafio.dominio;

import java.util.ArrayList;

public class Dev {
    private String nome;

    private Mentoria mentorias;

    private String atividades;

    public Dev(String nome, Mentoria mentorias, String atividades) {
        this.nome = nome;
        this.mentorias = mentorias;
        this.atividades = atividades;
    }

    public boolean increverNoBootcamp(){
        return true;
    }

    public void progredir(){}

    public float calcularTotalXp(float xp){
        return 0;
    }

    public ArrayList<Curso> exibirCursos(){
        return new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mentoria getMentorias() {
        return mentorias;
    }

    public void setMentorias(Mentoria mentorias) {
        this.mentorias = mentorias;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    @Override
    public String toString() {
        return "Devs{" +
                "nome='" + nome + '\'' +
                ", mentorias=" + mentorias +
                ", atividades='" + atividades + '\'' +
                '}';
    }
}

