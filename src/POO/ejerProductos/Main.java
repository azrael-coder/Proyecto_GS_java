package POO.ejerProductos;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        Alimento a1 =  new Alimento("Zumo", 2.5, 200);
        Alimento a2 =new Alimento("Galletas", 2.5, 300);
        Alimento a3 = new Alimento("Pan", 1.5, 250);
        Alimento a4 = new Alimento("Yogur natural", 1.20, 80);

        Electronico e1 = new Electronico("Tostadora", 2.5, 750);
        Electronico e2 = new Electronico("Microondas ", 2.5, 1000);
        Electronico e3 = new Electronico("Telefono", 5.0, 10);

        Producto[] productos = {a1,a2,a3,a4,e1,e2,e3};

        for (Producto p : productos){
            System.out.println(p);
            System.out.println("--------------------");
        }

        System.out.println("ORDENAR PRODUCTOS");

        Arrays.sort(productos);
        for (int i = 0; i < productos.length; i++){
            int descuentoAleatorio = r.nextInt(7);

            System.out.println(productos[i]);
            System.out.println();

            if(productos[i] instanceof Electronico eletronico){
                eletronico.esEficiente();
            }
            else if(productos[i] instanceof Alimento alimento){
                alimento.esBajoCalorias();
            }

            if (i == descuentoAleatorio){
                productos[i].setPrecio(productos[i].descuento(10));
                System.out.println("Menos 10% al precio de: " + productos[i]);
                System.out.println(productos[i].getPrecio());
            }
        }


    }
}
