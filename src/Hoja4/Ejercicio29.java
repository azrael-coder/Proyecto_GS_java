package Hoja4;
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        int factorial = 1;
        System.out.print(num+"!=");
        for (int contador = num; contador >= 1; contador--) {
            if(contador > 1)
                System.out.print(contador+"*");
            else
                System.out.print(contador);

            factorial = factorial * contador;
        }
        System.out.print(" = " + factorial);
    }
}
