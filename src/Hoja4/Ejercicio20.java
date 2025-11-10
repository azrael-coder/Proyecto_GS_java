package Hoja4;
/*Calcula la suma de los cuadrados de los números del 1 al 100*/
public class Ejercicio20 {
    static public void main(String[] args){
        double suma = 0;
        for (int i = 0; i <= 100; i++){
            double cuadrado = Math.pow(i,2);
            suma = suma + cuadrado;
        }
        IO.println(suma);
    }
}
