package org.example;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double valorBase, int cilindradas) {
        super(marca, modelo, ano, valorBase);
        this.cilindradas = cilindradas;
    }

    public double calcularValorRevenda(int anoAtual) {
        int anosDeUso = anoAtual - getAno();
        return getValorBase() * (1 - 0.05 * anosDeUso);
    }
}
