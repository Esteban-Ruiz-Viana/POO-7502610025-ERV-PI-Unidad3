package Taller_11_Clases_Abstractas.Ejercicio_2;

public class Gerente extends Empleado {

    //Atributo adicional ( solo lo tiene el gerente )
    private double bono;

    //Constructor
    public Gerente( String nombre, double bono ) {

        //Llama al constructor de Empleado
        super( nombre );
        this.bono = bono;

    }

    //Implementa el metodo abstracto de Empleado
    @Override
    public void calcularSalario() {

        System.out.println( "El salario del gerente incluye un bono de: " + bono );

    }
}