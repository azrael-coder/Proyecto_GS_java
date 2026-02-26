package POO.herencia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Empleado emple = new Empleado("NPC",1000.50, LocalDate.of(2003,4,14));
        Empleado emple2 = new Gerente("Finanzas","Gestor");
        Empleado emple3 = new Empleado("profe");

        Gerente g1 = new Gerente("Finanzas","Gestor");
        Gerente g2 = new Gerente("Administracion","name22",1250.68,LocalDate.of(1999,3,13));


        //System.out.println(emple);
        // g1.aplicarBono();
        System.out.println(emple2);
        System.out.println(emple3);
       System.out.println(g1);


      //  System.out.println(emple2);

        boolean iguales = emple2.equals(g1);
        System.out.println(iguales);
    }
}
