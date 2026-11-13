package Taller_12_Herencia_Multiple.Ejercicio_3;

//Punto 1: clase que NO implementa el metodo de la interfaz
//ERROR de compilacion: la clase Futbolista debe implementar el metodo jugar()

//public class Futbolista implements Jugador {

//}

//Version correcta implementando el metodo de la interfaz
public class Futbolista implements Jugador {

    @Override
    public void jugar() {

        System.out.println( "El futbolista esta jugando." );

    }
}