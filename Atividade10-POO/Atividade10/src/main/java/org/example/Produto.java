package org.example;

public class Produto {
    private int codigo;
    private String nome;
    private double precoUnitario;

    public Produto(int codigo, String nome, double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
