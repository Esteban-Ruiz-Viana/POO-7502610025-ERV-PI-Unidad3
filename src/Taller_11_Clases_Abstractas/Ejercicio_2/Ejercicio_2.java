package Taller_11_Clases_Abstractas.Ejercicio_2;

//1. Define una clase abstracta Empleado con un método abstracto calcularSalario.
//2. Crea dos clases derivadas (Gerente y Vendedor) que extiendan Empleado y proporcionen sus
// propias implementaciones de calcularSalario.
//3. Define un método mostrarDetalles en Empleado y utiliza calcularSalario para mostrar los detalles del empleado.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        //Objetos de las clases hijas
        Gerente gerente1 = new Gerente( "Laura", 500000 );
        Vendedor vendedor1 = new Vendedor( "Carlos", 200000 );

        //Mismo metodo, cada hijo calcula su salario a su manera
        System.out.println( "\nGerente:" );
        gerente1.mostrarDetalles();

        System.out.println( "\nVendedor:" );
        vendedor1.mostrarDetalles();

    }
}