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

    @Override
    public Mascota cruzar(Mascota pareja){
        Mascota cria = null;

        if (!(pareja instanceof Perro p) && pareja != null && pareja.getSexo() != super.getSexo()){
            return null;
        } else{
            String nuevaRaza= raza;
            if (this.raza.equals(p.getRaza()) ){
                nuevaRaza = "mezcla";
            }
            cria = new Perro(pareja.generarNombre(),Sexo.MASCULINO,nuevaRaza);
            return cria;
        }

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
