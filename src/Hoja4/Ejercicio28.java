/*Hacer un programa que muestre todos los resultados posibles que se pueden dar
al lanzar dos dados.*/
package Hoja4;
public class Ejercicio28 {
    public static void main(String[] args) {
        final int numMaximo = 6;
        final int numMaximo2 = 6;
        int d1 = 1;
        int d2 = 1;
        int contador = 0;
        do{
            System.out.println(d1+"\t"+d2);
            d2++;

            if(d2 > numMaximo){
                d1++;
                d2 = 1;
            }
            contador++;
        }while(d1 <= 6);

        System.out.println(contador);
    }
}
