/*Visualiza por pantalla la suma de los números pares y la suma de los impares
desde 1 hasta 100.*/
package Hoja4;

import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        int sumaPar = 0;
        int sumaImpar = 0;
        for (int i = 1; i<=100; i++){
            if(i % 2 != 0) {
                sumaImpar += i;
            } else {
                sumaPar += i;
            }
        }
        System.out.println(sumaPar+"\t\t "+sumaImpar);
    }
}
