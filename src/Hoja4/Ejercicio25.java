package Hoja4;
import java.util.Scanner;
public class Ejercicio25 {
    void main(){
        Scanner teclado = new Scanner(System.in);

        IO.print("Introdusca un caracter: ");
        char caracter = teclado.next().charAt(0);

        IO.print("Introdusca un numero: ");
        int numero = teclado.nextInt();
        do {
            if (numero <= 0) {
                IO.println("NUMERO INVALIDO");
                IO.print("Introdusca un numero: ");
                numero = teclado.nextInt();
            }
        }while(numero <= 0);

        for (int i = 0; i<numero; i++){
            IO.print(caracter);
        }

        teclado.close();
    }
}
