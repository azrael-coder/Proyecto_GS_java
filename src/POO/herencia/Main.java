package POO.herencia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empleado emple = new Empleado("NPC",1000.50, LocalDate.now());

        Gerente g1 = new Gerente("Informatica","name");
        Gerente g2 = new Gerente("Administracion","name22",1250.68,LocalDate.of(1999,3,13));

        System.out.println(emple);
        g1.aplicarBono();
        System.out.println(g1);
    }
}
