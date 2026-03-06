package POO.tiendaMascotas;
import java.util.Random;

public abstract class Mascota {
    private String nombre;
    private Sexo sexo;

    public Mascota() {}

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
     * Devuelve un nombre aleatorio para mascotas creando un array que tendra nombres segun el sexo de la cria
     * @return nombreMascota
     */
    protected static String generarNombres(Sexo sexo) {
        Random r = new Random();
        String nombreMascota = null;
        int nombreAleatorio =  r.nextInt(10);

        // declaro lo q se va a evaluar (nombres) luego el ? y poner lo q ha de pasar si es true : lo q pasa si es false
        String[] nombres = (sexo == Sexo.MASCULINO) ?
                new String[] {"Thomas", "Milo","Coco", "Bruno ", "Marshall", "Nugget", "Tequila", "Dante", "Fideo", "Sheldon"}
                : new String[] {"Luna", "Bella", "Nala", "Kira ", "Zoe", "Lola", "Sia", "Maia", "Alma ", "Arya"};


        for (int i=0; i < nombres.length; i++){
            nombreMascota = nombres[nombreAleatorio];
        }

        return nombreMascota;
    }




    /**
     * Devuelve el Sexo que tendra la cria de forma aleatoria
     * @return el sexo que tendra la cria
     */
    protected static Sexo asignarSexo(){
        Sexo sexo;
        Random rand = new Random();
        int r = rand.nextInt(2);

        if(r == 0)
            sexo = Sexo.MASCULINO;
        else
            sexo = Sexo.FEMENINO;

        return sexo;
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
