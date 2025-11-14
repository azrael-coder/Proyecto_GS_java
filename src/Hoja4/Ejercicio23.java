package Hoja4;
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        int num;
        int suma = 0;
        do {
            System.out.print("Ingrese el numero: ");
            num = teclado.nextInt();

            if (num % 5 == 0){
                suma += num;
            }
        } while(num !=0);
        System.out.println("La suma de los multiplos de 5 es: "+suma);
    }
}
