package Hoja1Tema3.estudiante;

import java.security.PublicKey;

public class Estudiante {
    private String nombre;
    private float notaFinal;
    private Estado estado;

    /**
     * CONSTRUCTOR VACIO
     */
    public Estudiante() {}

    public Estudiante (String nombre, float notaFinal, Estado estado){
        this.nombre = nombre;
        if (notaFinal > 0 && notaFinal <= 10)
            this.notaFinal = notaFinal;
        this.estado = estado;
    }

    /**
     * @return si esta suspenso o aprobado en funcion de la nota
     */
    public Estado calcularNota(){
        if (notaFinal >= 5)
            return Estado.APROBADO;
        else
            return Estado.SUSPENSO;
    }

    public void mostrarInfo(){
        System.out.println("El estudiante" + nombre + " tiene una nota final de " + notaFinal + " y esta " + calcularNota());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

