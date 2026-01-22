package hoja2_strings.ManejoString;

/**
 * Método que reciba una cadena de caracteres y devuelva el número de
 * minúsculas que tiene la cadena
 */
public class Ej3 {
    public static int numMinusculas(String cadena){
        int minusculas = 0;
        if (cadena.charAt(0) == 'a') {
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
                    minusculas++;
                }
            }
        }

        return minusculas;
    }
}
