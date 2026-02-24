package POO.herencia;

import java.time.LocalDate;

/**
 * @author israel
 */
public class Empleado {
    private String nombre;
    private double salario;
    private LocalDate fechaNacimiento;

    public Empleado(){}

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
}
