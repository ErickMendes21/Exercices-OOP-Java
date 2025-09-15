package org.example;

public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String marca, String modelo, int ano, double valorBase, int qtdPortas) {
        super(marca, modelo, ano, valorBase);
        this.qtdPortas = qtdPortas;
    }

    public double calcularValorRevenda(int anoAtual) {
        int anosDeUso = anoAtual - getAno();
        return getValorBase() * (1 - 0.10 * anosDeUso);
    }
}
