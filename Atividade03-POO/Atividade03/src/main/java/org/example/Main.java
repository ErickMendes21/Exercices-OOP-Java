package org.example;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumero(123);
        conta.setTitular("Erick");
        conta.setSaldo(100);

        System.out.println("Conta: " + conta.getNumero() + " - Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        conta.depositar(50);
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        conta.sacar(30);
        System.out.println("Saldo após saque: R$" + conta.getSaldo());

        conta.sacar(200);
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
