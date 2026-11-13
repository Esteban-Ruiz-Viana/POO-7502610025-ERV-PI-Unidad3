package Taller_13_Interfaces_vs_Clases_Abstractas.Ejercicio_1;

public class Triangulo extends Figura {

    //Atributos (solo los tiene el triangulo)
    private double base;
    private double altura;

    //Constructor
    public Triangulo( double base, double altura ) {

        this.base = base;
        this.altura = altura;

    }

    //Implementa el metodo abstracto de Figura
    @Override
    public double calcularArea() {

        return ( base * altura ) / 2;

    }
}