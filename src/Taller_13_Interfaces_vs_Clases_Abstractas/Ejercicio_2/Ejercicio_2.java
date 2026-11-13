package Taller_13_Interfaces_vs_Clases_Abstractas.Ejercicio_2;

//1. Define una interfaz Volador con un método volar.
//2. Define una interfaz Nadador con un método nadar.
//3. Crea una clase Pato que implemente ambas interfaces y defina sus métodos.
//4. Crea una clase de prueba para instanciar un objeto de Pato y usar ambos métodos.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        //Objeto de la clase Pato
        Pato pato1 = new Pato();

        //Usa los metodos de las dos interfaces
        pato1.volar();
        pato1.nadar();

    }
}