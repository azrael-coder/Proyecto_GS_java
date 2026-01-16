package hoja2_strings;

public class ManejoString {

    /**
     * Metodo manual para encontrar el caracter "a"
     */
    public static int posicionA (String cadena){
        int posicion = -1;
        String toLower= cadena.toLowerCase();
        for (int i = 1; i< toLower.length(); i++){
            if (toLower.charAt(i) == 'a'){
                posicion = i;
                i = cadena.length()+1;
            }
        }
        return posicion;
    }


    /**
     * Metodo usando indexOf para encontrar el caracter "a"
     */
    /*public static int posicion (String cadena, char caracter){
        if (cadena.indexOf(caracter)){

        }

        return
    }
    */
    public static void main(String[] args){
        int a= posicionA("Mamaguevo");
        System.out.println(a);
    }
}
