package hoja2_strings.ManejoString;

import java.util.StringTokenizer;

/**
 * Método que reciba una cadena de caracteres e imprima por pantalla la palabra
 * más larga de la cadena, además debe imprimir la longitud de dicha cadena.
 */
public class Ejercicio11 {
    public static void imprimirCadenaLarga(String cadena){
        StringTokenizer tk = new StringTokenizer(cadena);

        String palabra="";
        String palabraLarga ="";

        if (cadena != null) {
            while (tk.hasMoreTokens()) {
                palabra = tk.nextToken();

                if (palabra.length() > palabraLarga.length()) {
                    palabraLarga = palabra;
                }
            }
            System.out.println(palabraLarga+" Es la mas larga");
        }

    }

}
