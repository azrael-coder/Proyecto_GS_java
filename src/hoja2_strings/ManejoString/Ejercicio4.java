package hoja2_strings.ManejoString;

/**
 * Método que reciba una cadena de caracteres y devuelva el número de
 * mayúsculas que tiene la cadena
 */
public class Ejercicio4 {
    /**
     *
     * @param cadena
     * @return el numero de letras Mayusculas que hay en un String.
     * charAt aunque le pongas un caracter para comparar en el for usa internamente ASCII de ese
     * caracter para comparar.
     */
    public static int numMayusculas(String cadena){
        int mayusculas = 0;
        if (cadena != null) {
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z') {
                    mayusculas++;
                }
            }
        }

        return mayusculas;
    }
}
