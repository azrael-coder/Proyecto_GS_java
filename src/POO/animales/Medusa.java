package POO.animales;

public class Medusa extends Animal{
    private boolean veneno;

    public Medusa(){}

    public Medusa(String nombre, String especie, Sexo sexo, boolean veneno) {
        super(nombre, especie, sexo);
        this.veneno = veneno;
    }

}
