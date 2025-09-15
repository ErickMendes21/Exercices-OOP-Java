package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 80000.0, 4);
        Moto moto = new Moto("Yamaha", "Fazer", 2021, 25000.0, 250);

        int anoAtual = 2025;

        System.out.println("Valor de revenda do carro: R$" + carro.calcularValorRevenda(anoAtual));
        System.out.println("Valor de revenda da moto: R$" + moto.calcularValorRevenda(anoAtual));
    }
}