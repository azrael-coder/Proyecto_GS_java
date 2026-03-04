package POO.animales;

public class Gato extends Animal implements Sonido{
    private boolean callejero;
    private float peso;

    public Gato() {}

    public Gato(String nombre, String especie, Sexo sexo, boolean callejero, float peso) {
        super(nombre, especie, sexo);
        this.callejero = callejero;
        this.peso = peso;
    }


    @Override
    public String voz() {
        return "Miau, Miau";
    }
}
