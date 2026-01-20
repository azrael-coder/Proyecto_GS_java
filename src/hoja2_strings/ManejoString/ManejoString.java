package hoja2_strings.ManejoString;

public class ManejoString {
    public static String rotar(String cadena){
        String rotado = "";
        if (cadena != null) {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                rotado += cadena.charAt(i);
            }
        }
        return rotado;

    }

    public static String rotarString (String cadena){
        StringBuilder cad, invertido = null;
        if (cadena != null) {
            cadena ="";
            cad = new StringBuilder(cadena);
            invertido = cad.reverse();
        }

        return invertido.toString();

    }

    public static boolean esPalindromo(String cadena){
        boolean esPalindromo = false;
        String rotado = "";

        if (cadena != null) {
            rotado = ManejoString.rotar(cadena);

            if (cadena.equals(rotado)) {
                esPalindromo = true;
            }
        }
        return esPalindromo;
    }

    /**
     * Metodo manual para encontrar el caracter "a"
     */
    public static int posicionA (String cadena){
        int posicion = -1;
        if (cadena != null) {

            for (int i = 0; i < cadena.length(); i++) {
                if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'A')) {
                    posicion = i;
                    i = cadena.length() + 1;
                }
            }
        }
        return posicion;
    }


    /**
     * Metodo usando indexOf para encontrar el caracter "a"
     */
    public static int posicion (String cadena){
        int pos= -1;
        if (cadena != null) {
            pos= cadena.indexOf('a');
        }

        return pos;
    }

    public static void main(String[] args){
        int a= posicionA("caracter a");
        System.out.println(a);
    }
}


