package hoja2_strings.ManejoString;

/**
 * Método que reciba una cadena de caracteres y devuelva un boolean que se
 * encargue de comprobar si la cadena de caracteres es o no palíndromo (Es decir,
 * se lee igual hacia adelante o hacia detrás), por ejemplo la palabra “ala” es un
 * palindromo.
 */
public class Ejercicio6 {
    public static boolean esPalindromo(String cadena){
        boolean esPalindromo = false;
        String rotado = "";

        if (cadena != null) {
            rotado = Ejercicio5.rotar(cadena);

            if (cadena.equals(rotado)) {
                esPalindromo = true;
            }
        }
        return esPalindromo;
    }
}
