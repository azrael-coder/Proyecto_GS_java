package Hoja1Tema3.coche;

public class MainCoche {
    public static void main(String[] args){
        Coche coche1 = new Coche("Ford", "Mustang Mach 1",TipoCoche.CLASICO);

        System.out.println(coche1.mostrarInfo());
    }
}
