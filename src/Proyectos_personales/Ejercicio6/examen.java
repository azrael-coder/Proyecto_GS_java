package Proyectos_personales.Ejercicio6;
import java.util.Scanner;
/*EJERCICIO 6*/
public class examen {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int contPares;
        int contImpares;
        int num;
        int digito;

        do {
            System.out.println("Ingrese una secuencia de numeros:  (cero para finalizar)");
            num = teclado.nextInt();

            contImpares = 0;
            contPares = 0;

            if (num !=0){
                while (num > 0){
                    digito= num % 10;

                    if (digito % 2 == 0)
                        contPares ++;

                    if (digito % 2 != 0)
                        contImpares ++;

                    num /= 10;
                }

                System.out.println("Numeros pares: "+contPares);
                System.out.println("Impares: "+ contImpares);
            }
        } while (num != 0);




    }
}
