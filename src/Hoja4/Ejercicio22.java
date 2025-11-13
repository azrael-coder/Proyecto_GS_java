/*Calcular el sueldo semanal que recibirán un grupo de trabajadores, introduciendo
        por teclado el número de horas trabajadas por cada uno y el precio de cada hora.
        Si trabajan más de 40 horas semanales, las horas extra (por encima de 40) se pagan
        un 50% más del precio normal de la hora.
        El programa finalizará al introducir horas menor que 0.*/
package Hoja4;
import java.util.Scanner;
public class Ejercicio22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int horasTrabajadas;
        final int HORASMAXIMAS = 40;

        do{
            System.out.println("Horas trabajadas por el trabajador: |" + contador);
            horasTrabajadas = sc.nextInt();

            while(horasTrabajadas < 0){
                System.out.println("NUMERO INVALIDO");
                System.out.println("Vuelve a poner las horas trabajadas: ");
                horasTrabajadas = sc.nextInt();
            }

            System.out.print("Ingrese el precio de las horas: ");
            float precioHoras = sc.nextFloat();

            double sueldo = horasTrabajadas * precioHoras;

            if (horasTrabajadas <= 40){
                System.out.println("El sueldo semanal del trabajador es: "+sueldo);
            }else {
                int horasExtra = horasTrabajadas - 40;
                sueldo = HORASMAXIMAS * precioHoras + horasExtra * (precioHoras * 1.5);
                System.out.println("El sueldo semanal del trabajador es: "+sueldo);
            }
            contador++;
        }while(horasTrabajadas > 0);

        sc.close();
    }
}
