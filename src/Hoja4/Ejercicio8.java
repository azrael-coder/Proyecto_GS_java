package Hoja4;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);

        int []var1 = new int[5];
        int var2;
        int var3 = 1;

            for (var2 = 0; var2 < var1.length; var2++){
                System.out.println("Ingrese un numero: ");
                var1[var2] = objeto.nextInt();
                var3 *= var1[var2];
            }
        System.out.println("la multi es: "+var3);
    }
}
