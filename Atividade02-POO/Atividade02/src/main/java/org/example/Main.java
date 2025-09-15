package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 0);

        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual());

        carro.acelerar(30);
        System.out.println("Acelerar: " + carro.getVelocidadeAtual());

        carro.frear(10);
        System.out.println("Início frear 10: " + carro.getVelocidadeAtual());

        carro.frear(50);
        System.out.println("Após frear 50: " + carro.getVelocidadeAtual());
    }
}
