/*Calcula las potencias desde 1 hasta 5 de un número entero introducido por teclado.*/
package Hoja4_Tema1;
import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num=sc.nextInt();

        for (int i= 1; i <= 5; i++){
            double potencias = Math.pow(num,i);
            System.out.println("Las potencias de "+num+" son: "+potencias);
        }
    }
}
