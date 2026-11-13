package Taller_11_Clases_Abstractas.Ejercicio_1;

public class Rectangulo extends Figura {

    //Atributos (solo los tiene el rectangulo)
    private double base;
    private double altura;

    //Constructor
    public Rectangulo( double base, double altura ) {

        this.base = base;
        this.altura = altura;

    }

    //Implementa el metodo abstracto de Figura
    @Override
    public double calcularArea() {

        return base * altura;

    }
}