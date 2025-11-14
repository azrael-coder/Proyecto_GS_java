/*Escribe un programa que cuente el número de ceros aparecidos en una secuencia
de números enteros terminada en un número negativo. Solo cuenta ceros cuando
aparece el número 0. Esto resuelve el 32*/
package Hoja4;
import java.util.Scanner;
public class Ejercicio14 {
    static public void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String secuencia ="";
        int numero;
        int contador = 0;
        boolean seguir = true;
        do {
            System.out.println("Ingrese un numero: ");
             numero = teclado.nextInt();

             if(numero < 0){
                 seguir = false;
             }
             secuencia = String.valueOf(numero);

            for (int i = 0; i < secuencia.length(); i++) {
                if (secuencia.charAt(i) == '0') {
                    contador++;
                }
            }
        }while(seguir);

        System.out.println("Hay: "+contador+" ceros");
    }
}
