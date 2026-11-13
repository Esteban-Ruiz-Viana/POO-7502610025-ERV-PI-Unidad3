package Taller_11_Clases_Abstractas.Ejercicio_2;

public abstract class Empleado {

    //Atributo ( protected: lo pueden usar las clases hijas )
    protected String nombre;

    //Constructor
    public Empleado( String nombre ) {

        this.nombre = nombre;

    }

    //Metodo abstracto ( cada tipo de empleado lo implementa )
    public abstract void calcularSalario();

    //Metodo concreto que usa calcularSalario() para mostrar los detalles
    public void mostrarDetalles() {

        System.out.println( "Nombre: " + nombre );
        calcularSalario();

    }
}
