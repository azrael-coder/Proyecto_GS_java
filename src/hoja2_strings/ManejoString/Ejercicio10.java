package hoja2_strings.ManejoString;

import java.util.StringTokenizer;

/**
 * 10. Método que reciba una cadena de caracteres e imprima por pantalla todas las
 * palabras que la forman, cada una en una línea diferente, además debe imprimir
 * el número total de palabras que tiene la cadena.
 */
public class Ejercicio10 {
    public static void imprimirPalabras(String palabras) {
        StringTokenizer token = new StringTokenizer(palabras);
        String cadena = "";
        int contador = 0;

        if (palabras != null) {
            contador= token.countTokens();

            while(token.hasMoreTokens()) {
                cadena += token.nextToken() + "\n";
            }

            System.out.println(cadena);
            System.out.println("Palabras: " + contador);
        }

    }

}
