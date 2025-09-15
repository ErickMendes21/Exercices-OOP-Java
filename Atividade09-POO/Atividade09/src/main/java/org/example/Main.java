package org.example;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "123.456.789-00", "2023001", 7.5);
        Professor professor = new Professor("Marcos", "987.654.321-00", "Matemática", 160);

        System.out.println("Aluno aprovado? " + aluno.verificarAprovacao());
        System.out.println("Salário do professor: R$" + professor.calcularSalarioMensal(50.0));
    }
}