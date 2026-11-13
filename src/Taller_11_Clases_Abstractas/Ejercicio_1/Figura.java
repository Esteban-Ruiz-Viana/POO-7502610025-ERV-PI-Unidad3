package Taller_11_Clases_Abstractas.Ejercicio_1;

public abstract class Figura {

    //Metodo abstracto ( cada figura calcula su area a su manera )
    public abstract double calcularArea();

    //Metodo concreto que usa calcularArea() para mostrar el area
    public void mostrarArea() {

        System.out.println( "Area: " + calcularArea() );

    }
}