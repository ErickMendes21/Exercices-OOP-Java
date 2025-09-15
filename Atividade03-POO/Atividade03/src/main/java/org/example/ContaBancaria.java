package org.example;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
