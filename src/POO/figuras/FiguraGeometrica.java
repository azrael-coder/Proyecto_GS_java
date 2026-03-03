package POO.figuras;

import java.util.Scanner;

/**
 * @author Israel González Lopez
 */

public abstract class FiguraGeometrica {
    //Declarar atributos
    private String nombre;


    //Declaracion de metodos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public FiguraGeometrica(String nombre){
        this.nombre=nombre;
    }


    public String toString(){
        return nombre;
    }

    public static FiguraGeometrica crearFigura(int opcion){
        Scanner sc = new Scanner(System.in);
        if(opcion==1){
            System.out.println("Ingrese la base: ");
            int base = sc.nextInt();
            System.out.println("Ingrese la altura: ");
            int altura = sc.nextInt();

            return new Rectangulo(base, altura);
        }
        else if(opcion==2){
            System.out.println("Ingrese el radio: ");
            int radio = sc.nextInt();

            return new Circulo(radio);
        }
        else
            return null;
    }

}
