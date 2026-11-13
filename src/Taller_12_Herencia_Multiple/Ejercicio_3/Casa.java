package Taller_12_Herencia_Multiple.Ejercicio_3;

//Punto 2: MALA PRACTICA
//Compila, pero una casa no tiene logica para moverse
//Una clase debe implementar una interfaz solo si su logica
//esta alineada con los metodos de la interfaz

public class Casa implements Movible {

    @Override
    public void moverse() {

        System.out.println( "Las casas no se mueven." );

    }
}