package org.example;

public class Professor extends Pessoa {
    private String disciplina;
    private int cargaHoraria;

    public Professor(String nome, String cpf, String disciplina, int cargaHoraria) {
        super(nome, cpf);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularSalarioMensal(double valorHora) {
        return cargaHoraria * valorHora;
    }
}
