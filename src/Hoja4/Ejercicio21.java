package Hoja4;
import java.util.Scanner;
public class Ejercicio21 {
    void main(){
        Scanner teclado = new Scanner(System.in);

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        IO.print("Cuantos numeros quiere introducir? :");
        int n = teclado.nextInt();

        for (int i=0 ;i < n; i++){
            IO.print("Introdusca un numero: ");
            int num = teclado.nextInt();
                if (num <= 0){
                    do {
                        IO.println("Valor incorrecto");
                        IO.print("Introdusca un numero: ");
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
        IO.println("Hay "+cont1+" menores que 15 y "+cont2+" entre 15 y 50 y "+cont3+" mayores que 50");
    }
}
