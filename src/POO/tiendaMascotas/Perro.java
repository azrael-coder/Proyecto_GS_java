package POO.tiendaMascotas;

import java.util.Random;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, Sexo sexo, String raza) {
        super(nombre, sexo);
        this.raza = raza;
    }


    @Override
    public void decirAlgo(){
        System.out.println("Gua, Gua");
    }

    @Override
    public void gustosAlimentarios(){
        System.out.println("Comida preferida: comida para perros");
    }

    /**
     * Devuelve un objeto de tipo Mascota
     * @param pareja la otra mascota con la que se cruzara
     * @return la cria
     */
    @Override
    public Mascota cruzar(Mascota pareja){
        Mascota cria;

        if (!(pareja instanceof Perro) && pareja != null && pareja.getSexo() != super.getSexo()){ //FALLO AQUI
            return null;
        }
        else{
            String nuevaRaza= raza;

            // Si la raza es distinta se asigna a mezcla, sino se deja la de los padres
            if (!this.raza.equals( ((Perro) pareja).getRaza() )){
                nuevaRaza = "mezcla";
            }

            if (asignarSexo() == Sexo.MASCULINO){
                cria = new Perro(generarNombreMasculino(), Sexo.MASCULINO, nuevaRaza);
            }
            else
                cria = new Perro(generarNombreFemenino(), Sexo.FEMENINO, nuevaRaza);

            return cria;
        }
    }

    /**
     * Devuelve el Sexo que tendra la cria de forma aleatoria
     * @return el sexo que tendra la cria
     */
    private static Sexo asignarSexo(){
        Sexo sexo;
        Random rand = new Random();
        int r = rand.nextInt(2);

        if(r == 0)
            sexo = Sexo.MASCULINO;
        else
            sexo = Sexo.FEMENINO;

        return sexo;
    }

    @Override
    public String toString() {
        return super.toString() + " raza: " + raza ;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
