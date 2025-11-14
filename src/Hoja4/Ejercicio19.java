package Hoja4;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int x = sc.nextInt();

        int maximo = x * 2; //al multiplicar el numero q pasa el usuario por 2 se obtiene hasta donde quiere el usuario que se haye el cuadrado, para 10 * 2 = 20 de 2 a 20 son los diez primeros pares


        for (int i = 0; i <= maximo; i ++){
            if (i % 2 == 0){
                double cuadrado = Math.pow(i, 2);
                System.out.println(cuadrado);
            }
        }


    }
}
