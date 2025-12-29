package Hoja1Tema3.Ejercicio1_Lampara;
public class Main {
    public static void main(String[] args) {

        Lampara l1 = new Lampara("Rojo", true);

        //l1.apagar();

        l1.setColor("Azul");

        System.out.println(l1.getColor());
        l1.mostrarEstado();
    }
}
