package Hoja4;
import java.util.Scanner;
public class Ejercicio24 {
    void main() {
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        float mayor = 0;
        float menor = 0;
        int contador = 0;
        boolean seguir = true;
        do {
            IO.print("Ingrese un numero: ");
            int num = teclado.nextInt();

            if (contador == 0){
                mayor = num;
                menor = num;
            }
            if (num > mayor) {mayor = num;}
            if (num < menor && num != 0) {menor = num;}

                contador ++;
            if (num == 0) {seguir = false;}

            suma += num;
        } while(seguir);

        double media = suma / contador;

        IO.println("La media es: "+media);
        IO.println("El mayor es: "+mayor);
        IO.println("El menor es: "+menor);

        teclado.close();
    }
}
