package Hoja4;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);

        System.out.print("Introdusca una frase con letras y numeros: ");
        String frase = cadena.nextLine();

        int longitud = frase.length();

        int cont_letras = 0;
        int cont_digit = 0;
        for (int i = 0; i < longitud; i++){
            char cosito = frase.charAt(i);
            if (Character.isDigit(cosito)){
                cont_digit++;
            } else if (Character.isLetter(cosito)){
                cont_letras++;
            }
        }
        System.out.println("La frase introducida tiene: "+cont_letras+" letras y "+cont_digit+" digitos" );
    }
}
