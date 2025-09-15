package org.example;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private Integer velocidadeAtual;

    public Carro() {}

    public Carro(String marca, String modelo, Integer ano, Integer velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int valor){
        this.velocidadeAtual = velocidadeAtual + valor;
    }

    public void frear(int valor){
        this.velocidadeAtual = velocidadeAtual - valor;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
