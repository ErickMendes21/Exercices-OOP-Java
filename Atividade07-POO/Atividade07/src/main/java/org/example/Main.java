package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", "G01", 5000.0, 1500.0);
        Vendedor vendedor = new Vendedor("Ana", "V01", 3000.0, 800.0);

        System.out.println("Salário final do Gerente: R$" + gerente.calcularSalarioFinal());
        System.out.println("Salário final do Vendedor: R$" + vendedor.calcularSalarioFinal());

    }
}