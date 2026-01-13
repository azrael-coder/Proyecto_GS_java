package Hoja1Tema3.Ejercicio2_Circulo;

public class Circulo {
    private double radio;

    /**
     * Constructor que recibe el radio
     * @param radio radio del circulo
     */
    Circulo (double radio) {
        validarRadio(radio);
        this.radio = radio;
    }

    Circulo() {
        this(1.0);
        validarRadio(radio);
    }

    private double validarRadio (double radio){
        if (radio < 0)
            radio = 1.0;

        return radio;
    }


    public double calcularArea(){
        return 3.14 * (radio * radio);
    }

    public double calcularPerimetro(){
        return 3.14 * (radio*2);
    }

    public void mostrarInfo(){
        double area = calcularArea();
        double perimetro = calcularPerimetro();
        System.out.println("Radio actual: " + radio + "\n"+" Area: " + area + "\n" + " Perimetro: " + perimetro);
    }
}
