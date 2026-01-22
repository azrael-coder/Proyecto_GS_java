package hoja2_strings.ManejoString;

/**
 * Método que haga lo mismo que el anterior pero en este caso también recibirá
 * como parámetro el carácter a buscar y devolverá igual que en el caso anterior la
 * posición en que aparece dicho carácter por primera vez en la cadena de
 * caracteres pasada como parámetro, si no se encuentra dicho carácter devolverá el
 * valor -1.
 */
public class Ejercicio2 {

    public static int posicionA (String cadena){ //Metodo manual para encontrar el caracter "a"
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


        public static int posicion(String cadena){//Metodo usando indexOf para encontrar el caracter "a"
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
