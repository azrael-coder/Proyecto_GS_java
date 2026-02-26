package POO.herencia;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author israel
 */
public class Empleado {
    private String nombre;
    private double salario;
    private LocalDate fechaNacimiento;
    protected static final double SALARIO_BASE = 15000;

    /**
     * CONSTRUCTORES
     */
    public Empleado(){}


    public Empleado(String nombre, double salario) {
        this(nombre,salario,null);
    }

    public Empleado (String nombre, LocalDate fechaNacimiento) {
        this(nombre,0,fechaNacimiento);
    }

    public Empleado (String nombre){
        this(nombre,SALARIO_BASE,null);
    }

    public Empleado(String nombre, double salario, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        if (salario >= 0) {
            this.salario = salario;
        }

        /**
         * TODO A DIAS Y COMPARAR
         * OPCION 1
         */
        if (fechaNacimiento != null) {
            int anios = (int) fechaNacimiento.toEpochDay(); //FechaNacimiento a dias
            if (anios >= 6570) {
                this.fechaNacimiento = fechaNacimiento;
            }
        }

        /**
         * OPCION 2
         * SUMAR 18 A fechaNacimiento, SI  es mayor a la fecha actual tiene 18
         */
    }



    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", fechaNacimiento='" + fechaNacimiento.toString() + '\'' +
                '}';
    }


    //GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        boolean igual = false;
        if (o instanceof Empleado) {


            if ( salario == ((Empleado)o).getSalario() &&
                    nombre.equals(((Empleado) o).getNombre()) &&
                    fechaNacimiento.equals(((Empleado) o).getFechaNacimiento() ) ) {

                igual = true;
            }
        }
        return igual;
    }


}
