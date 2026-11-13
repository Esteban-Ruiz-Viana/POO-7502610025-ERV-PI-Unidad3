package Taller_12_Herencia_Multiple.Ejercicio_1;

//1. Define una interfaz Hablador con un método hablar.
//2. Define una interfaz Trabajador con un método trabajar.
//3. Crea una clase Persona que implemente ambas interfaces y defina sus métodos.
//4. Crea una clase de prueba para instanciar un objeto de Persona y usar ambos métodos.

public class Ejercicio_1 {

    public static void main( String[] args ) {

        //Objeto de la clase de prueba
        Persona persona1 = new Persona();

        //Usa los metodos de las dos interfaces
        persona1.hablar();
        persona1.trabajar();

    }
}