package Taller_12_Herencia_Multiple.Ejercicio_2;

//Implementa dos interfaces separadas por coma (herencia multiple)
public class Animal implements Volador, Nadador {

    //Implementa el metodo de Volador
    @Override
    public void volar() {

        System.out.println( "El animal esta volando." );

    }

    //Implementa el metodo de Nadador
    @Override
    public void nadar() {

        System.out.println( "El animal esta nadando." );

    }
}