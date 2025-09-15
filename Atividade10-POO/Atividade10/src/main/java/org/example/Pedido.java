package org.example;

import java.util.Date;

public class Pedido {
    private int numero;
    private Date data;
    private double valorTotal;

    public Pedido(int numero, Date data) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = 0.0;
    }

    public void adicionarProduto(Produto p, int quantidade) {
        valorTotal += p.getPrecoUnitario() * quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
