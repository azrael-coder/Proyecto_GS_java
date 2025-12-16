package Hoja1Tema3;

public class Main {
    public static void main(String[] args){
        Rectangulo r1 = new Rectangulo(5, 10, "verde");

        r1.calcularPerimetro();

        r1.calcularArea();

        double perimetro = r1.calcularPerimetro();
        double area = r1.calcularArea();

        System.out.println(perimetro+"\t"+area);
    }
}
