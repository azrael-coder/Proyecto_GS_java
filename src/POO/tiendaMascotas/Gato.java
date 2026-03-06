package POO.tiendaMascotas;

public class Gato extends Mascota implements Ronroneable {
    private String raza;


    public Gato(){}

    public Gato(String nombre, Sexo sexo, String raza){
        super(nombre, sexo);
        this.raza = raza;
    }



    public  void decirAlgo(){
        System.out.println("Miau");
    }
    public  void gustosAlimentarios(){
        System.out.println("Comida para gatos");
    }

    /**
     * Devuelve un objeto de tipo Mascota
     * @param pareja la otra mascota con la que se cruzara
     * @return la cria
     */
    public Mascota cruzar( Mascota pareja){
        Mascota cria =  null ;

        if (pareja != null && pareja instanceof Gato && pareja.getSexo() != super.getSexo()){
            String nuevaRaza = raza;

            // Si la raza es distinta se asigna a mezcla, sino se deja la de los padres
            if (!this.raza.equalsIgnoreCase( ((Gato) pareja).getRaza() )){
                nuevaRaza = "mezcla";
            }

            if (asignarSexo() == Sexo.MASCULINO){
                cria = new Gato(generarNombres(Sexo.MASCULINO), Sexo.MASCULINO, nuevaRaza);
            }
            else {
                cria = new Gato(generarNombres(Sexo.FEMENINO), Sexo.FEMENINO, nuevaRaza);
            }
        }

        return cria;
    }


    @Override
    public String toString() {
        return super.toString()+ " Tipo: Gato" + " raza: " + raza ;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null) {
            this.raza = raza;
        }
    }

    @Override
    public String ronronear() {
         return " RRRR RRRR RRRR";
    }
}
