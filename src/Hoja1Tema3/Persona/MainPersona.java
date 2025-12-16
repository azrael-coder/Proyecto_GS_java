package Hoja1Tema3.Persona;

public class MainPersona {
    public static void main(String[] args){
    Persona p1 = new Persona("Fulano", 23, Genero.MUJER, "Trabajador");


        switch (p1.getGenero()){
            case MUJER -> System.out.println("Voy para la COCINA");
            case HOMBRE -> System.out.println("Me llaman MACHISTA");
            default -> System.out.println("Soy No Binarie");
        }

        //System.out.println(p1.toString());

    }
}
