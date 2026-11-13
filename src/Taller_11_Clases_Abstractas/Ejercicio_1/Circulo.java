package Taller_11_Clases_Abstractas.Ejercicio_1;

public class Circulo extends Figura {

    //Atributo (solo lo tiene el circulo)
    private double radio;

    //Constructor
    public Circulo( double radio ) {

        this.radio = radio;

    }

    //Implementa el metodo abstracto de Figura
    @Override
    public double calcularArea() {

        return Math.PI * radio * radio;

    }
}