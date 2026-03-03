package POO.tiendaMascotas;
import java.util.Random;

public abstract class Mascota {
    private String nombre;
    private Sexo sexo;

    public Mascota(String nombre, Sexo sexo) {
        if (nombre != null) {
            this.nombre = nombre;
        }
        this.sexo = sexo;
    }

    //-------- METODOS ABSTRACTOS --------
    public abstract void decirAlgo();
    public abstract void gustosAlimentarios();
    public abstract Mascota cruzar( Mascota mascota);


    /**
     * Devuelve un nombre aleatorio para mascotas
     * @return nombreMascota
     */
    public String generarNombre(){
        Random r = new Random();
        String nombreMascota = "";
        int nombreAleatorio =  r.nextInt(10);
        String[] nombres = {"Luna", "Milo","Coco", "Bruno ", "Zoe", "Nugget", "Sia", "Dante", "Fideo", "Arya"};

            for (int i=0; i < nombres.length; i++){
                nombreMascota = nombres[nombreAleatorio];
            }

        return nombreMascota;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Mascota: " +  "nombre: " + nombre + '\'' +
                ", sexo: " + sexo;
    }
}
