package Hoja4;
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        float factorial = sc.nextFloat();

        int i,fact=1;
        for (i = 1; i <= factorial; i++) {
            fact = fact * i;
        }
        System.out.println("El factorial de "+factorial+" es "+fact);
    }
}

