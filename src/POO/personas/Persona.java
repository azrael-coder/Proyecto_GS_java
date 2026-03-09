package POO.personas;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private double ahorros;


    public Persona(){}

    public Persona(String nombre, String apellidos, double ahorros) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        if (ahorros > 0){
            this.ahorros = ahorros;
        }
    }





    public double getAhorros() {
        return ahorros;
    }

    public void setAhorros(double ahorros) {
        if (ahorros > 0) {
            this.ahorros = ahorros;
        }
    }


    public boolean gastarDinero(double cantidad){
        boolean resultado = false;
            if (cantidad <= ahorros){
                ahorros -= cantidad;
                resultado = true;
            }

        return resultado;
    }

    public void igresarDinero(double cantidad){
        ahorros += cantidad;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", ahorros=" + ahorros +
                '}';
    }

}
