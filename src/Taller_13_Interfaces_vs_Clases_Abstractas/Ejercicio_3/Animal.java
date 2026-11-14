package Taller_13_Interfaces_vs_Clases_Abstractas.Ejercicio_3;

public abstract class Animal {

    //Punto 2: default NO se puede usar en una clase abstracta
    //default solo existe en interfaces (desde Java 8)

    //default void hacerSonido() {
    //
    //    System.out.println( "Sonido generico" );
    //
    //}

    //Lo correcto: metodo concreto normal, sin la palabra default
    public void hacerSonido() {

        System.out.println( "Sonido generico" );

    }
}