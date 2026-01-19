package hoja2_strings;

public class ManejoString {

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
