package Hoja1Tema3.estudiante;

public class Main {
    public static void main (String[] args){
    Estudiante e1 = new Estudiante("Sal", 5, null);

        System.out.println(e1.calcularNota());
        e1.mostrarInfo();
    }
}
