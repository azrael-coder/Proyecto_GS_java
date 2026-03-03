package POO.figuras;
/**
 * @author Israel González Lopez
 */

import java.util.Scanner;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio){
        super("Circulo");
        if (radio > 0){
            this.radio = radio;
        }
    }


    /**
     * metodo que devuelve el area segun los parametros que pase el usuario
     * @return area
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    /**
     * metodo que devuelve el perimetro segun los parametros que pase el usuario
     * @return perimetro
     */
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }


    @Override
    public String toString() {
        return super.toString() +
                " radio=" + radio ;
    }
}
