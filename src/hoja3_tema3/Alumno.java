package hoja3_tema3;

public class Alumno {
    public static int totalAlumnos;
    public static final int EDAD_MINIMA = 18;
    private static final String CENTRO = "IES Tetuan";
    private String nombreAlumno;
    private int edad_Alumno;


    Alumno(String nombreAlumno, int edad_Alumno){
        this.nombreAlumno= nombreAlumno;
        this.edad_Alumno= edad_Alumno;
        totalAlumnos ++;
    }

    public String mostrarInfo(){
        return "Nombre:"+nombreAlumno+"\n"+
                "Edad: "+edad_Alumno+"\n"+
                "Centro: " +CENTRO;
    }

    public boolean validarEdad(){
        boolean requisito = false;
        return (edad_Alumno >= EDAD_MINIMA);
    }

    public String edadMinima(){
        return "Edad minima permitida: "+EDAD_MINIMA;
    }

    public static String cantidadAlumn(){
        return "Total de alumnos: "+totalAlumnos;
    }

}
