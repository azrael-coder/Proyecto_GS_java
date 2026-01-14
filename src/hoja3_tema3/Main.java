package hoja3_tema3;

public class Main {
    public static void main(String[] args){

        Alumno alumno1 = new Alumno("Jabladol", 18);
        Alumno alumno2 = new Alumno("Alejandro", 19);


        System.out.println(alumno1.mostrarInfo());

        System.out.println(Alumno.totalAlumnos + "\n" + Alumno.edadMinima());

        System.out.println(alumno2.validarEdad());
    }
}
