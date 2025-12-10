package Hoja1Tema3;

public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona("Generico", 23, "hombre", "estudiante");


        p1.saludar();
        p1.setEdad(17);
        System.out.println(p1.esMayorEdad());
    }
}
