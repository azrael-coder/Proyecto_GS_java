package Hoja4;
import java.util.Scanner;
public class Ejercicio16 {
    void main() throws InterruptedException{
        Scanner teclado = new Scanner(System.in);

        int divisores;
        IO.print("Ingrese un numero: ");
        int num1 = teclado.nextInt();
            do{
                if (num1 <= 0){
                    IO.println("Numero invalido");
                    IO.println("Ingrese un numero: ");
                    num1 = teclado.nextInt();
                }
            }while(num1 <= 0);

        teclado.close();

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                divisores = i;
                IO.println("Divisores de: "+num1);
                IO.print(divisores+"\n");
            }
        }
        Animacion.animacion();
    }
}
