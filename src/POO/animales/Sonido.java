package POO.animales;

public interface Sonido {
    float version = 0.1f;
    public String voz();

    public default String vozDurmiendo(){
        return "ZzZzZz";
    }

    public static String vozBostezar(){
        return "Ahhhhhh";
    }
}
