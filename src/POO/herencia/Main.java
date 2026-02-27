package POO.herencia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Empleado emple = new Empleado("NPC",1000.50, LocalDate.of(2003,4,14));
        Empleado emple2 = new Gerente("Finanzas","Gestor");
        Empleado emple3 = new Empleado("profe");

        Gerente g1 = new Gerente("Finanzas","Gestor");
        Gerente g2 = new Gerente("Administracion","name22",1250.68,LocalDate.of(1999,3,13));

        Director d1 = new Director("Jefatura","El Mencho",3000,LocalDate.of(2010,7,24),"ABC12345");

        //System.out.println(emple);
        // g1.aplicarBono();
        //System.out.println(emple2);
        //System.out.println(emple3);
       //System.out.println(g1);


        //System.out.println(d1);
        /*
        boolean iguales = emple2.equals(g1);
        System.out.println(iguales);
         */

        Empleado[] array =  new Empleado[3];
        array[0]=emple;
        array[1]=g2;
        array[2]=d1;

        for (int i = 0; i<array.length; i++){
            System.out.println(array[i].toString());
            if (array[i] instanceof Director dir){
                dir.trabajando();

            } else if (array[i] instanceof Gerente ger){
                ger.trabajarOficina();
            } else
                System.out.println("Identifiquese");

        }

    }
}
