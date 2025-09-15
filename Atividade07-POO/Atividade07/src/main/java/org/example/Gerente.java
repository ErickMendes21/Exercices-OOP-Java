package org.example;

public class Gerente extends Funcionario {
    private double bonusMensal;

    public Gerente(String nome, String matricula, double salarioBase, double bonusMensal) {
        super(nome, matricula, salarioBase);
        this.bonusMensal = bonusMensal;
    }

    public double calcularSalarioFinal() {
        return getSalarioBase() + bonusMensal;
    }
}
