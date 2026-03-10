package ejordenar;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona(33,"98765432R", LocalDate.now());
        Persona p2 = new Persona(33,"11111231P",LocalDate.now());
        Persona p3 = new Persona(23,"22222222P", LocalDate.now());
        Persona p4 = new Persona(28,"33333333P", LocalDate.now());
        Persona p5 = new Persona(42,"44444444P", LocalDate.now());

        int resultao = p1.compareTo(p2);

        if (resultao < 0){
            System.out.println("Persona p1 menor que p2");
        }
        else if (resultao > 0){
            System.out.println("Persona p1 mayor que p2");
        }
        else {
            System.out.println("Son iguales");
        }

        Persona[] personas = {p1,p2,p3,p4,p5};
        Arrays.sort(personas);

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
