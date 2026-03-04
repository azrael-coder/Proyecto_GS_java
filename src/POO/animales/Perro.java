package POO.animales;

public class Perro extends Animal implements Sonido{
    private String colorPelo;

    public Perro(){}


    public Perro(String nombre, String especie, Sexo sexo, String colorPelo){
        super(nombre, especie, sexo);
        this.colorPelo = colorPelo;
    }


    @Override
    public String voz() {
        return "Gua, Gua";
    }
}
