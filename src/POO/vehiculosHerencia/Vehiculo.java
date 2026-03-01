package POO.vehiculosHerencia;

import java.time.LocalDate;

public class Vehiculo {
    private String marca;
    private int cv;
    private float consumo;
    private double precio;
    private LocalDate fechaLanzamiento;
    private Modelo modelo;

    public Vehiculo() {}

    public Vehiculo(String marca, int cv, float consumo, double precio, LocalDate fechaLanzamiento, Modelo modelo) {
        this.marca = marca;
        this.cv = cv;
        if(consumo > 0){
            this.consumo = consumo;
        }
        if (precio > 0){
            this.precio = precio;
        }
        this.fechaLanzamiento = fechaLanzamiento;
        this.modelo = modelo;
    }





    public String mostrarVehiculo() {
        return  "marca: " + marca + '\'' +
                ", cv: " + cv +
                ", consumo: " + consumo +
                ", precio: " + precio +
                ", fechaLanzamiento: " + fechaLanzamiento +
                ", modelo: " + modelo;
    }

    //GETERS AND SETERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
