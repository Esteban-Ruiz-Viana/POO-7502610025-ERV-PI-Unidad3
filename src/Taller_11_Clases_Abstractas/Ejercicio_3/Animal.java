package Taller_11_Clases_Abstractas.Ejercicio_3;

public abstract class Animal {

    //Metodo concreto que las hijas necesitan sobrescribir
    //No da error, pero nada obliga a la hija a sobrescribirlo
    //Lo correcto seria declararlo abstract para que el compilador lo exija
    public void hacerSonido() {

        System.out.println( "Sonido generico" );

    }
}
