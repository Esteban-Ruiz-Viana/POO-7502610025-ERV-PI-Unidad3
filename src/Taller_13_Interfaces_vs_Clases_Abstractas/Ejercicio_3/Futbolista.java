package Taller_13_Interfaces_vs_Clases_Abstractas.Ejercicio_3;

//Punto 1: clase concreta que NO implementa el metodo de la interfaz
//ERROR de compilacion: la clase Futbolista debe implementar el metodo jugar()

//public class Futbolista implements Jugador {
//
//}

//Version corregida: implementa el metodo de la interfaz
public class Futbolista implements Jugador {

    @Override
    public void jugar() {

        System.out.println( "El futbolista esta jugando." );

    }
}