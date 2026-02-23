package POO.herencia;
/**
 * @author israel
 */
public class Empleado {
    private String nombre;
    private double salario;
    private String fechaNacimiento;

    public Empleado(){}

    public Empleado(String nombre, double salario, String fechaNacimiento) {
        this.nombre = nombre;
        if (salario >= 0) {
            this.salario = salario;
        }

        if (fechaNacimiento != null) {
            this.fechaNacimiento = fechaNacimiento;
        }
    }








    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
