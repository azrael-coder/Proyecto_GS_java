package Hoja2;
import java.util.Scanner;
public class Ejercicio11 {
     static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);

        System.out.println("Ingrese una hora en formato 24 horas: ");
         int h = objeto.nextInt();
         int resultado = 0;

         if (h < 12) {
            resultado = 12 - h+1;
         } else {
             resultado = 24 - h+1;
         }

         System.out.println("El reloj da campanadas: "+resultado);

     }
}
