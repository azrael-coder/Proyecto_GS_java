package Hoja1Tema3;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String ocupacion;


    //CONSTRUCTORES
    Persona (String nombre, int edad, String genero, String ocupacion){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ocupacion = ocupacion;
    }

    //CONSTRUCTOR VACIO??
    Persona(){

    }


    /**
     * Lanza un saludo
     */
    void saludar(){
        System.out.println("hola soy "+nombre+" y trabajo como "+ocupacion);
    }

    /**
     * Comprueba la edad de la persona
     * @return true si es mayor de edad y false en caso contrario
     */
    boolean esMayorEdad(){
        return edad > 18;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     *
     * @return genero: hombre o mujer SOLO ESOS DOS como debe ser
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @param genero: HOMBRE O MUJER o VARIOS TIPOS DE TRASTORNOS MENTALES
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }


    /**
     * GETs Y SETs
     * @return lo que es evidente
     */
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
