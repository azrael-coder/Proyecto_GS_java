package POO.vehiculosHerencia;

import java.time.LocalDate;

public class Camion  extends Vehiculo{
    private int numeroEjes;
    private double capacidadCarga;


    public Camion (){}

    public Camion(String marca, int cv, float consumo, double precio, LocalDate fechaLanzamiento, Modelo modelo, int numeroEjes, double capacidadCarga) {
        super(marca,cv,consumo,precio,fechaLanzamiento,modelo);
        this.numeroEjes = numeroEjes;
        if (capacidadCarga > 0) {
            this.capacidadCarga = capacidadCarga;
        }
    }

    @Override
    public String mostrarVehiculo(){
        return "---- CAMION ---- " + "\n" + super.mostrarVehiculo() + "\n" +
                "Ejes: "+ numeroEjes +
                "Capacidad de carga: "+ capacidadCarga + "\n";
    }

    public String permisoEspecial(){
        String resultado = "";
            if (numeroEjes >= 4)
                resultado = "Necesita de permiso especial";

        return resultado ;
    }
}
