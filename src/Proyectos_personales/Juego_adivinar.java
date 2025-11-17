// @author_Azrael
package Proyectos_personales;
import Hoja4.Animacion;
import java.util.Random;
import java.util.Scanner;
public class Juego_adivinar {
    public static int[] dificultad(int num_dificultad) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("ELIGE SABIAMENTE LA DIFICULTAD --> ");
        System.out.println("1= 1 hasta 10| 2= hasta 15| 3= hasta 20");
            num_dificultad = sc.nextInt();
            do {
                if (num_dificultad > 3) {
                    System.out.println("ERROR, Ingrese un numero valido");
                    num_dificultad = sc.nextInt();
                }
            }while(num_dificultad > 3);

        if (num_dificultad == 1)
            return new int[]{rand.nextInt(10) + 1, 3};
        else if (num_dificultad == 2)
            return new int[]{rand.nextInt(15) + 1, 5};

        else if (num_dificultad == 3)
            return new int[]{rand.nextInt(20) + 1, 7};

        return new int [] {rand.nextInt(10)+1, 3};
    }


    public static void main(String[] args ) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("----!INTENTA ADIVINAR EL NUMERO!----");

        int puntuacion = 0;

        boolean seguir = true;

        while (seguir) {
            boolean continuar = true;
            int[] resultado = dificultad(1);
            int intentos = resultado[1];                //NUMERO DE INTENTOS
            int num_aleatorio = resultado [0];          //NUMERO ALEATORIO

            System.out.println("Puntuacion actual: " + puntuacion);
            do {
                System.out.println("Tienes "+intentos+" intentos");
                System.out.println("Ingrese un numero: ");
                int intento = sc.nextInt();

                if (intento < num_aleatorio) {
                    System.out.println("El numero es mayor, vuelve a intentar");
                    intentos --;
                }else if (intento > num_aleatorio) {
                    System.out.println("El numero es menor, vuelve a intentar");
                    intentos --;
                } else {
                    System.out.println("!HAS ACERTADO!");
                    continuar = false;
                    puntuacion++;
                }

                if (intentos == 0)
                    System.out.println("Te has quedado sin intentos");


            } while(continuar && intentos > 0);

            System.out.println("Quieres seguir jugando? [s/n]: ");
            char espera = sc.next().charAt(0);
            if (espera != 's' && espera != 'S') {
                seguir = false;

            }


        }
        Animacion.animacion();
    }
}

