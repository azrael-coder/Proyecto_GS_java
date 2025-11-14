package Hoja4;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) throws InterruptedException{
        Scanner teclado = new Scanner(System.in);

        int divisores;
        System.out.print("Ingrese un numero: ");
        int num1 = teclado.nextInt();
            do{
                if (num1 <= 0){
                    System.out.println("Numero invalido");
                    System.out.println("Ingrese un numero: ");
                    num1 = teclado.nextInt();
                }
            }while(num1 <= 0);

        teclado.close();

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                divisores = i;
                System.out.println("Divisores de: "+num1);
                System.out.print(divisores+"\n");
            }
        }
        Animacion.animacion();
    }
}
