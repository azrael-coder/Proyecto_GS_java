package POO.herencia;

import java.time.LocalDate;

public class Gerente  extends Empleado{
    private String departamento;

    public Gerente(){
        super();
    }

    /**
     * ----- CONSTRUCTOR PRIMARIO -----
     * @param departamento departamento
     * @param nombre nombre
     * @param salario salario
     * @param fechaNacimiento fecha
     */
    public Gerente(String departamento, String nombre, double salario, LocalDate fechaNacimiento) {
        super(nombre,salario, null);
        this.departamento = departamento;
    }


    public Gerente(String departamento, String nombre) {
        this(departamento,nombre,SALARIO_BASE,LocalDate.now());
    }






    public void aplicarBono(){
        double salarioTotal = getSalario() + 500;
        setSalario(salarioTotal);
    }



    @Override
    public String toString() {
        return super.toString() + " Gerente{" +
                "departamento: " + departamento + '\'' +
                '}';
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
