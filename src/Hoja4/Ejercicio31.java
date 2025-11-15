/* Un número perfecto es un número natural que es igual a la suma de sus divisores
propios positivos, sin incluirse él mismo. Así por ejemplo 6 es un número
perfecto, porque sus divisores propios son 1, 2 y 3; y 6 = 1 + 2 + 3. Haz un
programa que calcule los números perfectos del 1 al 100.
*/
package Hoja4;
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num=1;

        while(num < 100) {
        num++;
            int suma = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }
            if (suma == num) {
                System.out.println(num + " es un numero perfecto");
                suma = 0;
            } else {
                System.out.println(num + " no es un numero perfecto");
            }
        }
    }
}
