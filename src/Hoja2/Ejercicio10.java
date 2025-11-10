package Hoja2;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);

        System.out.println("ingrese un numero: ");
        int num1 = objeto.nextInt();

        System.out.println("ingrese un numero: ");
        int num2 = objeto.nextInt();

        System.out.println("ingrese un numero: ");
        int num3 = objeto.nextInt();

        int resultado = 0;

        if (num1 < num2 && num1 < num3) {
            resultado = num1;
        } else if (num2 < num1 && num2 < num3) {
            resultado = num2;
        } else if (num3 < num1 && num3 < num2) {
            resultado = num3;
        }
        System.out.println("el "+ resultado +" es el menor ");
    }
}
