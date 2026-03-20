package POO.personas;

public class Jefe extends Persona implements  Trabajador{
    private String charla;

    public Jefe (String nombre, String apellidos, double ahorros){
        super(nombre,apellidos,ahorros);
    }


    public void prepararCharla(String charla) {
        this.charla=charla;
    }

    public String darCharla(){
        String resultado = charla;
        if (charla != null) {
            System.out.println(resultado);
        }

        charla = null;

        return resultado;
    }







    /**
     * o Función que simule que el usuario está trabajando
     */
    @Override
    public void trabajar() {
        System.out.println("Mirando a otros trabajar, porque soy el JEFE");
    }

    /**
     * Una función que simule que un trabajador cobra la nómina recibiendo la
     * cantidad a cobrar
     * @param cantidad el sueldo
     */
    @Override
    public void cobrarNomina(double cantidad) {
        super.igresarDinero(cantidad);
    }

    public String toString(){
        return super.toString();
    }
}
