package Hoja2;
import java.util.Scanner;
public class Ejercicio9 {
     static void main(String[] args) {
    Scanner objeto = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        char caracter = objeto.next().charAt(0);

        if (Character.isUpperCase(caracter)){
            System.out.println("Es mayuscula");
        } else if (Character.isLowerCase(caracter)){
            System.out.println("Es minuscula");
        } else if (Character.isDigit(caracter)){
            System.out.println("Es un digito");
        } else {
            System.out.println("no es letra ni digito");
        }
    }
}
