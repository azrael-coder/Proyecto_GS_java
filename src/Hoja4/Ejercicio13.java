package Hoja4;
import java.util.Scanner;
public class Ejercicio13 {
    public static void mostrarPuntos() throws InterruptedException {
        for (int i = 0; i < 3; i++) {       //METODO PARA LOS PUNTITOS ...
            Thread.sleep(700);
            System.out.print(".");
        }
        System.exit(0);
    }

    void main() throws InterruptedException {
        Scanner objeto = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = objeto.nextInt();

        if (num1 == 0) {
            System.out.print("No puede haber 0");
            mostrarPuntos();
        }
        System.out.print("Ingrese el segundo numero: ");
        int num2 = objeto.nextInt();

        if (num2 == 0) {
            System.out.print("No puede haber 0");
            mostrarPuntos();
        }
            for (num1= num1; num1 < num2; num1++) { //SUMADOR para que salga los numeros que hay entre los dos inputs
                System.out.print(num1+",");
            }

            Thread.sleep(3000);
            Animacion.animacion();
    }
}
