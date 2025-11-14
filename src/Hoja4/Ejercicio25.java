package Hoja4;
import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introdusca un caracter: ");
        char caracter = teclado.next().charAt(0);

        System.out.print("Introdusca un numero: ");
        int numero = teclado.nextInt();
        do {
            if (numero <= 0) {
                System.out.println("NUMERO INVALIDO");
                System.out.print("Introdusca un numero: ");
                numero = teclado.nextInt();
            }
        }while(numero <= 0);

        for (int i = 0; i<numero; i++){
            System.out.print(caracter);
        }

        teclado.close();
    }
}
