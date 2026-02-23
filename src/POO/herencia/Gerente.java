package POO.herencia;

public class Gerente  extends Empleado{
    private String departamento;

    public Gerente(){
        super();
    }

    public Gerente(String departamento) {
        super("Fulano",1100.50,"23-02-2026");
        this.departamento = departamento;
    }


    @Override
    public String toString() {
        return super.toString() + "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
