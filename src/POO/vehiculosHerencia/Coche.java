package POO.vehiculosHerencia;

import java.time.LocalDate;

import static POO.vehiculosHerencia.Modelo.*;


public class Coche  extends Vehiculo {
    private int numPuertas;
    private String acabado;

    public Coche() {}


    public Coche(String marca, int cv,float consumo,double precio,LocalDate fechaLanzamiento,Modelo modelo,int numPuertas, String acabado) {
        super(marca, cv, consumo, precio, fechaLanzamiento, modelo);
        this.numPuertas = numPuertas;
        this.acabado = acabado;
    }

    @Override
    public String mostrarVehiculo(){
        return "---- COCHE ---- " + "\n" + super.mostrarVehiculo() + "\n" +
                "Numero de puertas: "+ numPuertas + "\n" +
                "Acabado: "+ acabado + "\n";
    }


    public String mostrarExtras(){
       String resultado = "";
        if (getModelo() == BASICO){
            resultado = "Climatizador: No”, Llantas: No";
        }else if (getModelo() == INTERMEDIO){
            resultado = "Climatizador: Si”, Llantas: No";
        } else if (getModelo()== ALTO){
            resultado = "Climatizador: Si”, Llantas: Si";
        }

       return resultado;
    }





}
