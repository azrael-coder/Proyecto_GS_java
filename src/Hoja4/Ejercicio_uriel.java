package Hoja4;
//Declara un array de tipo double en el que se almacenarán 15 lecturas de la presión
//Simula las lecturas rellenando el array con valores aleatorios entre 50 y 150
//Muestra por pantalla todas las lecturas obtenidas
//Calcula y muestra:
//La presión máxima, correspondiente al pico de presión detectado.
//La presión mínima, correspondiente al nivel más bajo registrado.
//El promedio de las lecturas, que representa el nivel general de estabilidad atmosférica.
//Después evalúa los resultados obtenidos:
//Si el promedio está entre 90 y 110, muestra: "Condiciones de vuelo estables". En caso contrario, muestra: "Inestabilidad detectada, revisar parámetros de presión."
//Si la lectura máxima supera los 140, muestra además: "¡Presión crítica detectada, riesgo de rotura del fuselaje!"
//Si la lectura mínima está por debajo de 95, muestra además: "Advertencia: presión baja, posible fuga de aire en la cabina."
//Si las condiciones resultan estables, el piloto obtiene 5 puntos adicionales de preparación.
import java.util.Random;
public class Ejercicio_uriel {
    public static void main(String[] args){
        Random random = new Random();
        double[] array = new double[15];
        int min = 50;
        int max = 150;

        for (int i = 0; i < array.length; i++){   //bucle para asignar valores al array
            int aleatorio = random.nextInt(max-min+1) + min;
            array[i] = aleatorio;
        }

        double mayor = array[0]; //bucle para hayar la presion maxima
        double menor = array[0];
        for (double n : array){
            if (n > mayor)
                mayor = n;

            if (n < menor)
                menor = n;
        }

        double prom = 0;
        for (int i = 0; i<array.length; i++){ //bucle para hayar la presion promedio
            prom += array[i];
        }
        prom = prom/15;

            System.out.println("Lecturas obtenidas:");
            for ( double n : array) //bucle para las lecturas
                System.out.println(n);

            System.out.println("------------------------");

            System.out.println("La presion maxima es: "+mayor+" y la minima es: "+menor);

            System.out.println("------------------------");
                System.out.println("El promedio es: "+prom);

            if (prom >= 90 && prom <= 110){
                System.out.println("Condiciones de vuelo estables, obtiene 5 puntos de preparacion");
            } else
                System.out.println("Inestabilidad detectada, revisar parámetros de presión");

            System.out.println("------------------------");

            if (mayor > 140){
                System.out.println("¡Presión crítica detectada, riesgo de rotura del fuselaje!");
            } else if (menor < 95){
                System.out.println("Advertencia: presión baja, posible fuga de aire en la cabina");
            }

    }
}
