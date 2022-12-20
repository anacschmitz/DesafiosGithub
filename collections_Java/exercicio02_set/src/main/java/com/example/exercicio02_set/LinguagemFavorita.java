package com.example.exercicio02_set;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;

    private String anoCriacao;

    private String ide;

    public LinguagemFavorita(String nome, String anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public int compareTo(LinguagemFavorita linguagem) {
//        int nome = this.getNome().compareTo(linguagem.getNome());
//        return nome;
//    }

    @Override
//    public int compareTo(LinguagemFavorita linguagem) {
//        int ide = this.getIde().compareTo(linguagem.getIde());
//        return ide;
//    }

//    public int compareTo(LinguagemFavorita linguagem) {
//        int ano = this.getAnoCriacao().compareTo(linguagem.getAnoCriacao());
//        if (ano != 0) return ano;
//        int nome = this.getNome().compareTo(linguagem.getNome());
//        return nome;
//}

    public int compareTo(LinguagemFavorita linguagem) {
        int nome = this.getNome().compareTo(linguagem.getNome());
        if (nome != 0) return nome;

        int ano = this.getAnoCriacao().compareTo(linguagem.getAnoCriacao());
        if(ano != 0) return ano;

        int ide = this.getIde().compareTo(linguagem.getIde());
        return ide;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(String anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoCriacao='" + anoCriacao + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }
}


