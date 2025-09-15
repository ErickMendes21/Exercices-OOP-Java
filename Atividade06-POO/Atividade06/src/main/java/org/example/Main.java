package org.example;

public class Main {
    public static void main(String[] args) {
        Publicacao[] publicacoes = new Publicacao[2];

        publicacoes[0] = new Livro("Java Avançado", 2020, "José Silva");
        publicacoes[1] = new Revista("Tech Magazine", 2022, 45);

        for (Publicacao p : publicacoes) {
            p.exibirInformacoes();
            System.out.println();
        }
    }
}