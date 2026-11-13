package Taller_12_Herencia_Multiple.Ejercicio_2;

//1. Define una interfaz Volador con un método volar.
//2. Define una interfaz Nadador con un método nadar.
//3. Crea una clase Animal que implemente ambas interfaces y defina sus métodos.
//4. Crea una clase de prueba para instanciar un objeto de Animal y usar ambos métodos.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        //Objeto de la clase Animal
        Animal animal1 = new Animal();

        //Usa los metodos de las dos interfaces
        animal1.volar();
        animal1.nadar();

    }
}
