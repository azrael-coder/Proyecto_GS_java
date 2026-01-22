package hoja2_strings.ManejoString;

public class Ejercicio5 {
    /**
     *
     * @param cadena
     * @return la cadena de texto del reves
     */
    public static String rotar(String cadena){
        String rotado = "";
        if (cadena != null) {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                rotado += cadena.charAt(i);
            }
        }
        return rotado;

    }

    /**
     *
     * @param cadena
     * @return devuelve la cadena de texto invertida, usando la clase StringBuilder
     */
    public static String rotarString (String cadena){
        StringBuilder cad, invertido = null;
        if (cadena != null) {
            cadena ="";
            cad = new StringBuilder(cadena);
            invertido = cad.reverse();
        }

        return invertido.toString();

    }
}
