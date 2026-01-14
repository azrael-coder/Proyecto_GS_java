package Hoja1Tema3.Ejercicio2_Circulo;
import java.util.Scanner;

public class MainCirculo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        double radio = sc.nextDouble();

        Circulo c1 = new Circulo(-3);
        c1.mostrarInfo();
    }
}
