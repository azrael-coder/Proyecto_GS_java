package Hoja4;
import java.util.Scanner;
public class Ejercicio9 {
    public static void mostrarPuntos() throws InterruptedException {
        for (int i = 0; i < 3; i++) {       //METODO PARA LOS PUNTITOS ...
            Thread.sleep(700);
            IO.print(".");
        }
        System.exit(0);
    }

    public static void main() throws InterruptedException{
       Scanner objeto = new Scanner(System.in);
        //Ejercicio 9 y 10
       int num1;
        do {
            System.out.print("Ingrese un numero: ");
            num1 = objeto.nextInt();

            if (num1 > 0 && num1 % 2 == 0){
                IO.println("El numero: " +num1+ " es positivo y par");
            } else if (num1 > 0 && num1 % 2 != 0) {
                IO.println("El numero: "+num1+ " es impar y positivo");
            } else {
                IO.println("El numero: "+num1+ " es impar y negativo");
            } if (num1 ==0) {
                IO.print("Finalizando");
                mostrarPuntos();
            }
        } while (num1 != 0);

    }
}
