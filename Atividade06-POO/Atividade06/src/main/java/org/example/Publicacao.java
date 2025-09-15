package org.example;

public class Publicacao {
    protected String titulo;
    protected int ano;

    public Publicacao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo + ", Ano: " + ano);
    }
}
