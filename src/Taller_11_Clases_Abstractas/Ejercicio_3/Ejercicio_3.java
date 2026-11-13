package Taller_11_Clases_Abstractas.Ejercicio_3;

//1. Intenta instanciar una clase abstracta directamente y observa los errores de compilación.
//2. Intenta definir un método concreto en una clase abstracta que sea necesario sobrescribir en las clases derivadas.

public class Ejercicio_3 {

    public static void main( String[] args ) {

        //Instanciar una clase abstracta
        //ERROR de compilacion: Figura es abstracta, no se puede instanciar
        //Figura figura1 = new Figura();

        //Metodo concreto que habia que sobrescribir
        Animal perro1 = new Perro();
        perro1.hacerSonido();

    }
}