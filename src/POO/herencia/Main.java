package POO.herencia;

public class Main {
    public static void main(String[] args) {
        Empleado emple = new Empleado("NPC",1000.50,"19-2-2003");

        Gerente g1 = new Gerente("Informatica");
        Gerente g2 = new Gerente();

        System.out.println(emple.toString());
        System.out.println(g1.toString());
    }
}
