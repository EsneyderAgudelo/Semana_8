package com.example;

public abstract class Main {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++++++++++++");
        Perro p1 = new Perro("Zeus", "Canino", "Doberman", 5, "Grande", "Negro", "Excelente");
        p1.hacerSonido();
        p1.alimentar();
        p1.cuidar();
        p1.mostrarInformacion();
        

        System.out.println("++++++++++++++++++++++++++++++++++++");
        Gato g1 = new Gato("Tilin", "Felino", "Egipcio", 3, "Pequeño", "Rosado", "Muy bueno");
        g1.hacerSonido();
        g1.alimentar();
        g1.cuidar();
        g1.mostrarInformacion();
        

        System.out.println("++++++++++++++++++++++++++++++++++++");
        Pajaro pj1 = new Pajaro("Pepe", "Tucan", "null", 4, "Pequeño", "Morado", "Excelente");
        pj1.hacerSonido();
        pj1.alimentar();
        pj1.cuidar();
        pj1.mostrarInformacion();
        

        System.out.println("++++++++++++++++++++++++++++++++++++");
        Tortuga t1 = new Tortuga("Don Tortugo", "Reptil", "Pitan", 100, "Grande", "Cafe", "Muy buena");
        t1.hacerSonido();
        t1.alimentar();
        t1.cuidar();
        t1.mostrarInformacion();
    }
}