package hoja2_strings.ManejoString;

public class Ejercicio7 {
    public static String marcarPalabra(String palabra, String cadena) {
        String sfinal = cadena;
        int posicion = 0;
        int pos =0;
        if (palabra != null && cadena != null) {
            while(pos !=-1){
                pos= sfinal.indexOf(palabra,posicion);

                //Ha encontrado la palabra sino devuelve -1
                if (pos != -1) {
                    sfinal = sfinal.substring(0,pos)+ "*" + sfinal.substring(pos);
                    posicion = pos+ palabra.length(); //CRUCIAL PARA EVITAR BUCLE INFINITO pos + la longitud de la palabra
                }

            }

        }
        return sfinal;
    }


    public static String marcarPal(String palabra, String cadena) {

        String cadenaFinal = cadena;
        int posBusqueda = 0;
        int pos = 0;

        if (cadena != null && palabra != null) {
            while (pos != -1) {
                pos = cadenaFinal.indexOf(palabra, posBusqueda);
                //Si ha encontrado la palabra
                if (pos != -1) {
                    cadenaFinal = cadenaFinal.substring(0, pos) + "*" + cadenaFinal.substring(pos);
                    posBusqueda = pos + palabra.length() + 1;
                }
            }
        }
        return cadenaFinal;
    }


    public static String replace(String palabra, String cadena) {
        String resultado = "";

        resultado = cadena.replace(palabra,"*"+palabra);

        return resultado;
    }
}
