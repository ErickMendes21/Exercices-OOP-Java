package org.example;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 4);
        Gato gato = new Gato("Mimi", 2);

        cachorro.latir();
        gato.miar();
    }
}