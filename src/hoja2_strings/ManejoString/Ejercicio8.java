/**
 * 8. Método que reciba una cadena de caracteres y una palabra y se encargue de
 * obtener el número de veces que aparece la palabra en la cadena
 *  public static int buscarVecesPalabra(String palabra, String cadena);
 *  Para contar la cantidad de veces que aparece la palabra podemos utilizar
 * de nuevo el método indexOf para ver si esta, si la posición que nos
 * devuelve ese método es distinta de -1 (significa que se encuentra la
 * palabra) entonces debemos sumar uno a la cantidad de veces que aparece
 * la palabra, y debemos de volver a buscar si hay otra palabra, es
 * importante cambiar la posición desde la que buscamos en nuestro String
 * ya que, o si no, estaremos contando siempre y de forma infinita la misma
 * palabra que encuentre.
 */
package hoja2_strings.ManejoString;
public class Ejercicio8 {
    public static int buscarVeces(String palabra, String cadena){
        int posicion = 0;
        int veces = 0;
        int pos = 0;

        if(palabra != null && cadena != null){
            while (pos != -1){

                pos = cadena.indexOf(palabra, posicion);
                //Aqui la encuentra si es que esta
                if (pos != -1){
                    veces++;
                    posicion =pos + palabra.length()+1;
                }
            }
        }

        return veces;
    }


}
