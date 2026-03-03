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
    public Mascota cruzar(Mascota mascota){

        if (!(mascota instanceof Perro p)){
            return null;
        } else{
            return mascota;
        }

    }


}
