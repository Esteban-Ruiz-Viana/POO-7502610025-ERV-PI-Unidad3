package Taller_13_Interfaces_vs_Clases_Abstractas.Ejercicio_3;

//1. Intenta crear una clase concreta que implemente una interfaz sin proporcionar implementaciones de sus métodos y observa los errores de
//compilación.
//2. Intenta definir métodos predeterminados en una clase abstracta y discute por qué esto no es posible.

public class Ejercicio_3 {

    public static void main( String[] args ) {

        //Punto 1: con la version corregida de Futbolista
        Futbolista futbolista1 = new Futbolista();
        futbolista1.jugar();

        //Punto 2: metodo normal heredado de la clase abstracta
        Hija hija1 = new Hija();
        hija1.hacerSonido();

    }
}