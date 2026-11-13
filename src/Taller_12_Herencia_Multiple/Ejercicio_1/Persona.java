package Taller_12_Herencia_Multiple.Ejercicio_1;

//Implementa dos interfaces separadas por coma (herencia multiple)
public class Persona implements Hablador, Trabajador {

    //Implementa el metodo de Hablador
    @Override
    public void hablar() {

        System.out.println( "La persona esta hablando." );

    }

    //Implementa el metodo de Trabajador
    @Override
    public void trabajar() {

        System.out.println( "La persona esta trabajando." );

    }
}
