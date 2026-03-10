package ejordenar;

import java.time.LocalDate;

public class Persona implements Comparable<Persona>, Cloneable {
    private int edad;
    private String dni;
    private LocalDate fechaNaciemiento;


    public Persona(int edad, String dni, LocalDate fechaNaciemiento) {
        this.edad = edad;
        this.dni = dni;
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public int compareTo(Persona p){
        int resultado = -1;
        if (this.edad < p.edad){
            resultado = -1;
        }
        else if (this.edad > p.edad){
            resultado = 1;
        }
        else{
            resultado =  dni.compareTo(p.dni); //compareTo() devuelve 0 si son iguales, sino devolvera -1 o 1 si es mayor o menor
        }

        return resultado;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public Persona clone() {
        Persona clone = new Persona(edad, new String (dni), LocalDate.of(fechaNaciemiento.getYear(), fechaNaciemiento.getMonth(),fechaNaciemiento.getDayOfMonth()));

        return clone;
    }
}
