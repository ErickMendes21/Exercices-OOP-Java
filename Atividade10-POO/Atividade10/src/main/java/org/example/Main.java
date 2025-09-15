package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Caneta", 2.5);
        Produto p2 = new Produto(2, "Caderno", 10.0);
        Produto p3 = new Produto(3, "Mochila", 150.0);

        Pedido pedido = new Pedido(1001, new Date());

        pedido.adicionarProduto(p1, 10);
        pedido.adicionarProduto(p2, 3);
        pedido.adicionarProduto(p3, 1);

        System.out.println("Valor total do pedido: R$" + pedido.getValorTotal());
    }
}