package POO.figuras;
/**
 * @author Israel González Lopez
 */

import java.util.Scanner;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;


    public Rectangulo(double base, double altura){
        super("Rectangulo");
        if (base > 0 && altura > 0){
            this.base = base;
            this.altura = altura;
        }
    }

    /**
     * metodo que devuelve el area segun los parametros que pase el usuario
     * @return area
     */
    public double calcularArea(){
        return base * altura;
    }

    /**
     * metodo que devuelve el perimetro segun los parametros que pase el usuario
     * @return perimetro
     */
    public double calcularPerimetro(){
        return (base + altura) * 2;
    }


    @Override
    public String toString() {
        return super.toString() +
                " base=" + base +
                ", altura=" + altura ;
    }
}
