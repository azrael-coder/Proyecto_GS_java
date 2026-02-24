package hoja2_strings.ManejoString;

import java.util.StringTokenizer;

/**
 * Método que reciba una cadena de caracteres y se encargue de mostrar sus siglas.
 * Por ejemplo: si la cadena es “Organización Tratado Atlántico Norte” devuelva
 * “OTAN”
 */
public class Ejercicio12 {
    public static void imprimirSiglas(String frase){
        StringTokenizer tk = new StringTokenizer(frase);
        String palabra = "";
        String siglas = "";
        char char1;

        if(frase != null) {

            while (tk.hasMoreTokens()) {
                palabra = tk.nextToken();

                char1 = Character.toUpperCase(palabra.charAt(0));
                siglas += char1;
                }
            }
        System.out.println(siglas);
        }


    }


