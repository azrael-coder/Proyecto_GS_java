package POO.vehiculosHerencia;

import java.time.LocalDate;

import static POO.vehiculosHerencia.Modelo.*;

public class Moto extends Vehiculo {
    private int numeroVelocidades;
    private String suspensionDelantera;


    public Moto(){}

    public Moto(String marca, int cv, float consumo, double precio, LocalDate fechaLanzamiento, Modelo modelo,int numeroVelocidades, String suspensionDelantera) {
        super(marca,cv,consumo,precio,fechaLanzamiento,modelo);
        if (numeroVelocidades > 0) {
            this.numeroVelocidades = numeroVelocidades;
        }
        this.suspensionDelantera = suspensionDelantera;
    }


    public String incrementoPrecio(){
        String resultado = "";

         if (getModelo() == INTERMEDIO){
            resultado = "El precio de la moto tiene un incremento del 10%";
        } else if (getModelo()== ALTO){
            resultado = "El precio de la moto tiene un incremento del 15%";
        }

        return resultado;
    }

    @Override
    public String mostrarVehiculo(){
        return "---- MOTO ---- " + "\n" + super.mostrarVehiculo() + "\n" +
                "Numero de velocidades: "+ numeroVelocidades + "\n" +
                "Suspension delantera: "+ suspensionDelantera + "\n";
    }

}
