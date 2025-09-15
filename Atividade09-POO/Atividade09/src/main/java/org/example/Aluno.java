package org.example;

public class Aluno extends Pessoa {
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, String cpf, String matricula, double notaFinal) {
        super(nome, cpf);
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public boolean verificarAprovacao() {
        return notaFinal >= 6.0;
    }
}
