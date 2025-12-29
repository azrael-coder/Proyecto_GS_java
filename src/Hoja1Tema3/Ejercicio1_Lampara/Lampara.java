package Hoja1Tema3.Ejercicio1_Lampara;
/**
 * @version 0.3
 */
public class Lampara {
    private boolean encendido;
    private String color;

    /**
     * Constructor por defecto
     */
    Lampara () {
        encendido = false;
        color = "blanco";
    }

    Lampara (String color, boolean encendido) {
        this();
        this.encendido = true;
    }


    public void encender () {
        cambiarEstado(true);
    }

    public void apagar () {
        cambiarEstado(false);


    }

    private void cambiarEstado(boolean estado) {
       this.encendido = estado;

    }


    /**
     * METODO PARA COMPROBAR ESTADO DE LA LAMPARA
     */
    void mostrarEstado () {
        String estado;
        estado = encendido ? "encendida" : "apagada";
        System.out.println("La lampara esta: "+estado);
    }

    public String getColor(){
        return this.color;
    }

    public void setColor (String color){
        this.color= color;
    }


}
