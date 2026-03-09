package POO.personas;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Nombre", "Gonzalez",889);

        estudiante1.pagarbeca();


        estudiante1.estudiar(6);

        System.out.println(estudiante1);
    }
}
