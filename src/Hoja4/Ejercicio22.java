//Calcular el sueldo semanal que recibirán un grupo de trabajadores,
// introduciendo por teclado el número de horas trabajadas por cada uno y el precio de cada hora
//Si trabajan más de 40 horas semanales, las horas extra (por encima de 40) se pagan
//un 50% más del precio normal de la hora.
//El programa finalizará al introducir horas menor que 0
package Hoja4;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int sueldo_semanal = 0;
        final int HORASMAXIMAS = 40;
        int horas;
        int total_horas = 0;
        float sueldo = 0f;
        int cont_trabajadores = 1;
        do {
            System.out.println("Cuantas horas ha hecho el trabajador:    " + cont_trabajadores);
            horas = teclado.nextInt();

             System.out.println("A cuanto le pagan la hora al trabajador?: "+cont_trabajadores);
            float precio = teclado.nextFloat();

            sueldo = horas * precio;
            cont_trabajadores ++;

            if (horas > HORASMAXIMAS){
                int horas_extras = horas - HORASMAXIMAS;
                double sueldo_extra = horas_extras * (precio * 1.5);
                double sueldo_final = sueldo + sueldo_extra;

                System.out.println("EL sueldo del trabajadorr "+cont_trabajadores+ " es "+ sueldo_final);
            } else {
                System.out.println("EL sueldo del trabajador "+cont_trabajadores+ " es "+ sueldo);
            }
        } while (horas > 0 );

    }
}
