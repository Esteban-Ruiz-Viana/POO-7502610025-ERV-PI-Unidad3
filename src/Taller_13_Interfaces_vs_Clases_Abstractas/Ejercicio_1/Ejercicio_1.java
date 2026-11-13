package Taller_13_Interfaces_vs_Clases_Abstractas.Ejercicio_1;

//1. Define una clase abstracta Figura con un método abstracto calcularArea.
//2. Crea dos clases derivadas (Rectangulo y Triangulo) que extiendan Figura y proporcionen sus
// propias implementaciones de calcularArea.
//3. Crea una clase de prueba que instancie objetos de Rectangulo y Triangulo y muestre sus áreas.

public class Ejercicio_1 {

    public static void main( String[] args ) {

        //Objetos de las clases hijas (Figura no se puede instanciar)
        Rectangulo rectangulo1 = new Rectangulo( 15, 6 );
        Triangulo triangulo1 = new Triangulo( 10, 6 );

        //Muestra el area de cada figura
        System.out.println( "\nArea del rectangulo: " + rectangulo1.calcularArea() );
        System.out.println( "Area del triangulo: " + triangulo1.calcularArea() );

    }
}