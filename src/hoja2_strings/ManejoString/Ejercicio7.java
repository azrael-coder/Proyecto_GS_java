package hoja2_strings.ManejoString;

public class Ejercicio7 {
    public static String marcarPalabra(String palabra, String cadena) {
        String sfinal = "";
        int posicion = 0;
        int pos =0;
        if (palabra != null && cadena != null) {
            while(posicion !=-1){
                pos= cadena.indexOf(palabra,posicion);

                //Ha encontrado la palabra sino devuelve -1
                if (pos != -1) {

                }

            }

        }
        return sfinal;
    }

    public static String replace(String palabra, String cadena) {
        String resultado = "";

        resultado = cadena.replaceAll(palabra,"*"+palabra);

        return resultado;
    }
}
