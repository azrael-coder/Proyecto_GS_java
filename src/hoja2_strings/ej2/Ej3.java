package hoja2_strings.ej2;

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
