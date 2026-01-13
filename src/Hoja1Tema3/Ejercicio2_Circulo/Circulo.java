package Hoja1Tema3.Ejercicio2_Circulo;

public class Circulo {
    private double radio;

    /**
     * Constructor que recibe el radio
     * @param radio radio del circulo
     */
    Circulo (double radio) {
        this.radio = radio;
        validarRadio();
    }

    Circulo() {
        this(1.0);
        validarRadio();
    }

    private double validarRadio (){
        if (radio <= 0)
            radio= 1;

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

    public void setRadio(double radio){
        if (radio > 0)
            this.radio= radio;
    }
}

