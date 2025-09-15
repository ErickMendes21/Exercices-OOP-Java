package org.example;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    public double calcularSalarioFinal() {
        return getSalarioBase() + comissao;
    }
}
