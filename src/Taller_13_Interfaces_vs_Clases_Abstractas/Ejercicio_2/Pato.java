package Taller_13_Interfaces_vs_Clases_Abstractas.Ejercicio_2;

//Implementa dos interfaces separadas por coma
public class Pato implements Volador, Nadador {

    //Implementa el metodo de Volador
    @Override
    public void volar() {

        System.out.println( "El pato esta volando." );

    }

    //Implementa el metodo de Nadador
    @Override
    public void nadar() {

        System.out.println( "El pato esta nadando." );

    }
}