/*Dado un número N entero positivo que se introducirá por teclado, genera una tabla
formada por los cuadrados y los cubos de los números desde 1 hasta N.*/
package Hoja4;
import java.util.Scanner;
public class Ejercicio26 {
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int cuadrado = 0;
        int cubo = 0;
        int numero = teclado.nextInt();
        for (int i = 1; i <= numero;i++){
            cuadrado = i * i;
            cubo = i * i * i;

            System.out.println(i+"\t\t"+cuadrado+"\t\t"+cubo);
        }
    }
}
