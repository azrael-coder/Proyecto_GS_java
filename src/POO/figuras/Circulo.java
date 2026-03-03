package POO.figuras;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(String nombre,double radio){
        super(nombre);
        if (radio > 0){
            this.radio = radio;
        }
    }

    /**
     * metodo que devuelve el area
     * @return area
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    /**
     * metodo que devuelve el perimetro
     * @return perimetro
     */
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radio=" + radio +
                '}';
    }
}
