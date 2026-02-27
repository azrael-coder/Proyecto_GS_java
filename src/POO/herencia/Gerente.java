package POO.herencia;

import java.time.LocalDate;
import java.util.Objects;

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
        super(nombre,salario, fechaNacimiento);
        this.departamento = departamento;
    }


    public Gerente(String departamento, String nombre) {
        this(departamento,nombre,SALARIO_BASE,LocalDate.now());
    }


    /**
     * Metodo para aplicar un bono al salario
     */
    public void aplicarBono(){
        double salarioTotal = super.getSalario() + 500;
        setSalario(salarioTotal);
    }


    @Override
    public boolean equals(Object o) {
        boolean iguales = false;

        if (o instanceof Gerente gerente) {
            if (super.equals(o) && departamento.equalsIgnoreCase(gerente.getDepartamento() )) {
                iguales = true;
            }
        }
        return iguales;
    }


    @Override
    public String toString() {
        return super.toString() + " Gerente{" +
                "departamento: " + departamento  +
                '}' + '\n';
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void trabajarOficina(){
        System.out.println("Trabajando oficina...");
    }
}
