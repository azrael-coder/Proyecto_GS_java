package hoja2_strings.rotarCadena;

public class RotarCadena {
    public static String rotar(String cadena){
        String rotado = "";
        for (int i=cadena.length(); i>0; i-- ){
            rotado += cadena.charAt(i);
        }

        return rotado;

    }
}
