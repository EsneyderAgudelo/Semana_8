package com.example;

public class Tortuga extends Mascota{
    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoSalud) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color;
        this.estadoSalud = estadoSalud;
        }

    @Override
    public void alimentar() {
    System.out.println("La tortuga esta comiendo");
        
    }

    @Override
    public void cuidar() {
    System.out.println("La tortuga esta cuidando la casa");
        
    }

    @Override
    public void hacerSonido() {
    System.out.println("Ajjj Ajjj");
    
        
    }
}
