package hoja2_strings.ManejoString;

/**
 * Método que reciba una cadena de caracteres y una letra X, y coloque en
 * mayúsculas cada aparición de X en la cadena, modificando la cadena.
 */

/**
 * Metodo usando replace que le pasas lo que debe buscar y por cual caracter cambiarlos
 */
public class Ejercicio13 {
    public static String ponerCaracterMayuscula(String cadena, char car){
        String resultado="";

        if (cadena != null){
            resultado=cadena.replace(car,Character.toUpperCase(car));
        }
        return resultado;
    }

    public static String ponerCaracterMayuscula2(String cadena, char car){
        String resultado="";
        if (cadena != null){

        }

        return resultado;
    }
}
