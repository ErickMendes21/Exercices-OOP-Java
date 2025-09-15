package org.example;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double valorBase;

    public Veiculo(String marca, String modelo, int ano, double valorBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorBase = valorBase;
    }

    public int getAno() {
        return ano;
    }

    public double getValorBase() {
        return valorBase;
    }
}
