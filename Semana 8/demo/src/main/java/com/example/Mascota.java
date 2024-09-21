package com.example;

public abstract class Mascota {
    public String nombre;
    public String especie;
    public String raza;
    public int edad;
    public String tamaño;
    public String color;
    public String estadoSalud;

    

    public String getNombre() {
        return nombre;
    }



    public String getEspecie() {
        return especie;
    }



    public String getRaza() {
        return raza;
    }



    public int getEdad() {
        return edad;
    }



    public String getTamaño() {
        return tamaño;
    }



    public String getColor() {
        return color;
    }



    public String getEstadoSalud() {
        return estadoSalud;
    }



    public abstract void hacerSonido();

    public abstract void alimentar();

    public abstract void cuidar();
  
    public void mostrarInformacion(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La especie es: " + especie);
        System.out.println("La raza es: " + raza);
        System.out.println(" La edad es: " + edad);
        System.out.println("El tamaño es: " + tamaño);
        System.out.println("El color es: " + color);
        System.out.println("El estado de saluda es: " + estadoSalud);
    }
    
}
