package POO.figuras;

public abstract class FiguraGeometrica {
    //Declarar atributos
    private String nombre;


    //Declaracion de metodos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();


    public FiguraGeometrica(String nombre){
        this.nombre=nombre;
    }


    public String toString(){
        return nombre;
    }
}
