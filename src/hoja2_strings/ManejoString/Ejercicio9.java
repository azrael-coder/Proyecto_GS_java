package hoja2_strings.ManejoString;
import java.util.StringTokenizer;

public class Ejercicio9 {
    //USANDO LA CLASE StringTokenizer
    public static int buscarTokens(String cadena){
        StringTokenizer st = new StringTokenizer(cadena);
        int numPalabras = 0;
        if (cadena != null){
            numPalabras = st.countTokens();
        }

        return  numPalabras;
    }
}
