package Taller_12_Herencia_Multiple.Ejercicio_3;

//1. Intenta crear una clase que implemente una interfaz sin proporcionar las implementaciones
// de sus métodos y observa los errores de compilación.
//2. Intenta implementar interfaces en clases que no tienen lógica relevante para esas
// interfaces y discute por qué es una mala práctica.

public class Ejercicio_3 {

    public static void main( String[] args ) {

        //Punto 1: con la version corregida de Futbolista
        Futbolista futbolista1 = new Futbolista();
        futbolista1.jugar();

        //Punto 2: compila, pero no tiene sentido
        Casa casa1 = new Casa();
        casa1.moverse();

    }
}
