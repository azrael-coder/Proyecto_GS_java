import java.util.Scanner;
public class Main {
     static void main(String[] args) {
         //Ejercicio4
        Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese un numero: ");
         int num1 = sc.nextInt();
         int suma = 0;

         while (num1 < 0) {
             System.out.println("Numero incorrecto, no puede ser negativo ");
             num1 = sc.nextInt();
         }

         for (int i = 0; i < num1; i++) {
             suma += i;
         }
         System.out.println("La suma desde 1 hasta "+num1+" es: "+suma);
    }
}
