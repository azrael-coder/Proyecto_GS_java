package POO.animales;

public class Leon extends Animal implements Sonido{
    private int tamanioMelena;

    public Leon(String nombre, String especie, Sexo sexo, int tamanioMelena){
        super(nombre, especie, sexo);
        this.tamanioMelena = tamanioMelena;
    }
    public Leon(){}

    @Override
    public String voz(){
        return "Rugido";
    }


    @Override
    public String vozDurmiendo() {
        return "Grrrr!! y ZzZzZz";
    }
}
