package POO.tiendaMascotas;

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
        Mascota cria = null;

        if ((pareja instanceof Perro) && pareja != null && pareja.getSexo() != super.getSexo()){ //FALLO AQUI(arreglado)
            String nuevaRaza= raza;

            // Si la raza es distinta se asigna a mezcla, sino se deja la de los padres
            if (!this.raza.equalsIgnoreCase( ((Perro) pareja).getRaza() )){
                nuevaRaza = "mezcla";
            }

            if (asignarSexo() == Sexo.MASCULINO){
                cria = new Perro(generarNombres(Sexo.MASCULINO), Sexo.MASCULINO, nuevaRaza);
            }
            else
                cria = new Perro(generarNombres(Sexo.FEMENINO), Sexo.FEMENINO, nuevaRaza);

            return cria;
        }

        else{
            return null;
        }
    }


    @Override
    public String toString() {
        return super.toString() + " Tipo: Perro" + " raza: " + raza ;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
