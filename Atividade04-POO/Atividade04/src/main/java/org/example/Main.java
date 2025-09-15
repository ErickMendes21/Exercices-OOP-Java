package org.example;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 19, "2023101");
        Professor professor = new Professor("Ana", 40, 5500.0);

        System.out.println("Aluno: " + aluno.getNome() + ", Idade: " + aluno.getIdade() + ", Matrícula: " + aluno.getMatricula());
        System.out.println("Professor: " + professor.getNome() + ", Idade: " + professor.getIdade() + ", Salário: R$" + professor.getSalario());
    }
}