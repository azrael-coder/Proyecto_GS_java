package POO.herencia;

import java.time.LocalDate;

public class Director extends Gerente{
    private  String vehiculoEmpresa;

    /**
     * CONSTRUCTOR POR DEFECTO
     */
    public Director(){};

    public Director(String departamento, String nombre, double salario, LocalDate fechaNacimiento, String vehiculoEmpresa){
        super(departamento, nombre, salario, fechaNacimiento);
        this.vehiculoEmpresa = vehiculoEmpresa;
    }

    public Director(String vehiculoEmpresa){
        this.vehiculoEmpresa = vehiculoEmpresa;
    }


    public String toString(){
        return super.toString() + "Director de : " + super.getDepartamento() + "\n" +
                "Matricula: " + vehiculoEmpresa;
    }

    public void trabajando(){
        System.out.println("Trabajando, llamar antes de entrar....");
    }

}
