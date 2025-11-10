package Hoja4;
import java.util.Scanner;
public class Ejercicio12 {
    void main() throws InterruptedException{
        Scanner objeto = new Scanner(System.in);

        int cont_varones = 0;
        int cont_ancianos = 0;
        int edad = 1;

        while (edad != 0) {
            IO.println("Ingrese su edad: ");
            edad = objeto.nextInt();

            objeto.nextLine(); //Limpiar el buffer de lectura para que el String se lea bien y no de la exepcion

            if (edad == 0) {
                break;
            }

            IO.println("Ingrese su sexo: ");
            String sexoinput = objeto.nextLine();
            char sexo = sexoinput.charAt(0);

            IO.println("Ingrese su estado civil: ");
            String estadoCivil = objeto.nextLine();

            if (edad > 30 && sexo == 'H' || sexo == 'h' ) {
                cont_varones++;
            }if (edad > 60) {
                cont_ancianos++;
            }

        }
            IO.println("Hay "+cont_varones+" hombres mayores de 30 y "+cont_ancianos+" personas mayores de 60");

            Animacion.animacion();

    }
}
