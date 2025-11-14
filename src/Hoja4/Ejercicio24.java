/*Escribir un programa que lea una secuencia de datos numéricos de longitud
        indefinida de manera que cuando el número introducido sea el cero cesará la
        entrada de dicha secuencia. El programa debe imprimirnos la media de todos, el
        mayor y el menor.
 */
package Hoja4;
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        float mayor = 0;
        float menor = 0;
        int contador = 0;
        boolean seguir = true;
        do {
            System.out.print("Ingrese un numero: ");
            int num = teclado.nextInt();

            if (contador == 0){
                mayor = num;
                menor = num;
            }
            if (num > mayor) {mayor = num;}
            if (num < menor && num != 0) {menor = num;}


            if (num == 0) {seguir = false;}
            contador ++;
            suma += num;
        } while(seguir);

        double media = suma / contador;

        System.out.println("La media es: "+media);
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);

        teclado.close();
    }
}
