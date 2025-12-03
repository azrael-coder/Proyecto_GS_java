package Hoja2;
import java.util.Scanner;
public class Ejercicio2 {
     static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);

        int[] array = new int[3];

        for (int i = 0; i < array.length; i++){
            System.out.println("Ingrese un numero: ");
            array[i] = objeto.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++){
             suma += array[i];
        }
        System.out.println("La suma es: " + suma);

    }
}