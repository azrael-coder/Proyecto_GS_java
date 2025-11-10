package Hoja2;
import java.util.Scanner;
public class Ejercicio3 {
     static void main (){
        Scanner objeto = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = objeto.nextInt();

        System.out.println("Ingrese un numero: ");
        int b = objeto.nextInt();

        if (a > b){
            System.out.println("El numero "+a+" es mayor que "+b);
        } else if (b > a){
            System.out.println("El numero "+b+" es mayor que "+a);
        }else{
            System.out.println("Son iguales");
        }
    }
}
