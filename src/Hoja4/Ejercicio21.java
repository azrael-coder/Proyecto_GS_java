package Hoja4;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        System.out.print("Cuantos numeros quiere introducir? :");
        int n = teclado.nextInt();

        for (int i=0 ;i < n; i++){
            System.out.print("Introdusca un numero: ");
            int num = teclado.nextInt();
                if (num <= 0){
                    do {
                        System.out.println("Valor incorrecto");
                        System.out.print("Introdusca un numero: ");
                        num = teclado.nextInt();
                    }while(num <=0);
                }

            if (num < 15){
                cont1 ++;
            } else if (num <= 50){
                cont2 ++;
            } else
                cont3 ++;

        }
        System.out.println("Hay "+cont1+" menores que 15 y "+cont2+" entre 15 y 50 y "+cont3+" mayores que 50");
    }
}
