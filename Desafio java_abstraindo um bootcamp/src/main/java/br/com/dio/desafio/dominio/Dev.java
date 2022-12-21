package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosCooncluidos = new LinkedHashSet<>();

    private Mentoria mentorias;

    public Dev(String nome) {
        this.nome = nome;
    }

    public void increverNoBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosCooncluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double calcularTotalXp(){
        double xp = this.conteudosCooncluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                        .sum();
        return xp;
    }

    public ArrayList<Curso> exibirCursos(){
        return new ArrayList<>();
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosCooncluidos() {
        return conteudosCooncluidos;
    }

    public void setConteudosCooncluidos(Set<Conteudo> conteudosCooncluidos) {
        this.conteudosCooncluidos = conteudosCooncluidos;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosCooncluidos, dev.conteudosCooncluidos) && Objects.equals(mentorias, dev.mentorias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosCooncluidos, mentorias);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "\nnome='" + nome + '\'' +
                "\nconteudosInscritos=" + conteudosInscritos +
                "\nconteudosCooncluidos=" + conteudosCooncluidos +
                "\nmentorias=" + mentorias +
                '}';
    }
}

