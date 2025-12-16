package Hoja1Tema3;
import org.w3c.dom.css.Rect;

public class Rectangulo {

    private double ancho;
    private double alto;
    private String color;



    public Rectangulo() {
    }


    public Rectangulo (double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }


    /**
     * Crea un constructor por defecto
     * @param ancho
     * @param alto
     * @param color
     */
    public Rectangulo(double ancho, double alto, String color){
        if (alto > 0 && ancho > 0){
            this.ancho = ancho;
            this.alto = alto;
        }else
            System.out.println("PARAMETROS INVALIDOS");

        if (color.equals("rojo") || color.equals("verde")){
            this.color = color;
        } else
            System.out.println("Color invalido");
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Calcular el perimetro
     * @return el perimetro del rectangulo
     */
    public double calcularPerimetro(){
        return ((alto *2) + (ancho*2));
    }

    public double calcularArea(){
        return (ancho * alto);
    }


    /**
     * Cambia el color del rectangulo
     * @param newColor
     */
    public void cambiarColor(String newColor){
        if (newColor.equals("rojo") || newColor.equals("verde")){
            color = newColor;
        } else
            System.out.println("Color invalido");
    }
}
