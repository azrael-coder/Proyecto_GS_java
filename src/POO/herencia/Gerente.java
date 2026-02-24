package POO.herencia;

import java.time.LocalDate;

public class Gerente  extends Empleado{
    private String departamento;

    public Gerente(){
        super();
    }

    public Gerente(String departamento) {
        super("Fulano",1100.50, LocalDate.now());
        this.departamento = departamento;

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
