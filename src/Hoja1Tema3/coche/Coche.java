package Hoja1Tema3.coche;

/**
 * @author Azrael
 * @version 0.1
 * @see TipoCoche
 */
public class Coche {
    private String marca;
    private String modelo;
    /**
     * tipoCoche(SUV, DEPORTIVO, CLASICO, ELECTRICO)
     */
    private TipoCoche tipo;

    /**
     * CONSTRUCTOR VACIO ????
     */
    public Coche(){

    }

    public Coche (String marca, String modelo ){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche (String marca, String modelo, TipoCoche TipoCoche){
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = TipoCoche;
    }

    public String mostrarInfo(){
        return "El coche es un "+marca+" "+modelo+" de tipo "+tipo;
    }


}
