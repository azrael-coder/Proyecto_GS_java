package POO.herencia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empleado emple = new Empleado("NPC",1000.50, LocalDate.now());

        Gerente g1 = new Gerente("Informatica");
        Gerente g2 = new Gerente();

        System.out.println(emple.toString());
        g1.aplicarBono();
        System.out.println(g1.toString());
    }
}
