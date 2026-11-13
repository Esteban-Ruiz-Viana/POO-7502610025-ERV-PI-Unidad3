package Taller_11_Clases_Abstractas.Ejercicio_2;

public class Vendedor extends Empleado {

    //Atributo adicional ( solo lo tiene el vendedor )
    private double comision;

    //Constructor
    public Vendedor( String nombre, double comision ) {

        //Llama al constructor de Empleado
        super( nombre );
        this.comision = comision;

    }

    //Implementa el metodo abstracto de Empleado
    @Override
    public void calcularSalario() {

        System.out.println( "El salario del vendedor incluye una comision de: " + comision );

    }
}