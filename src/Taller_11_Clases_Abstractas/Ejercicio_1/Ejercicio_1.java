package Taller_11_Clases_Abstractas.Ejercicio_1;

//1. Define una clase abstracta Figura con un método abstracto calcularArea.
//2. Crea dos clases derivadas (Circulo y Rectangulo) que extiendan Figura y proporcionen
// sus propias implementaciones de calcularArea.
//3. Define un método mostrarArea en Figura y utiliza calcularArea para mostrar el área.

public class Ejercicio_1 {

    public static void main( String[] args ) {

        //Objetos de las clases hijas
        Circulo circulo1 = new Circulo( 16 );
        Rectangulo rectangulo1 = new Rectangulo( 42, 20 );

        //Cada figura calcula su area de forma distinta
        System.out.println( "\nCirculo:" );
        circulo1.mostrarArea();

        System.out.println( "\nRectangulo:" );
        rectangulo1.mostrarArea();

    }
}