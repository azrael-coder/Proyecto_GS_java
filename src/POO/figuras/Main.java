package POO.figuras;
import java.util.Scanner;

/**
 * @author Israel González Lopez
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FiguraGeometrica[] figura = new FiguraGeometrica[10];
        int contador = 0;
        int opcion;

        do{

            System.out.println("-----MENU-----");
            System.out.println("1-> Crear rectángulo");
            System.out.println("2-> Crear círculo");
            System.out.println("3-> Visualizar figuras");
            System.out.println("4-> Salir");
            opcion = sc.nextInt();
            sc.nextLine(); //Evitar errores de lectura

            if (contador == 10 && opcion < 3){
                System.out.println("No se pueden crear mas figuras");
                continue;
            }
            switch(opcion){
                case 1: {
                    FiguraGeometrica r1 = Rectangulo.crearFigura(opcion);
                    if (r1 != null) {
                        figura[contador] = r1;
                        contador++;
                    }
                    break;
                }
                case 2: {
                    FiguraGeometrica r2 = Circulo.crearFigura(opcion);
                    if (r2 != null) {
                        figura[contador] = r2;
                        contador++;
                    }
                    break;
                }

                case 3: {
                    for (int i = 0; i < contador; i++){

                            System.out.println(figura[i]);
                            System.out.println("Perimetro: " + figura[i].calcularPerimetro());
                            System.out.println("Area: " + figura[i].calcularArea()) ;

                            System.out.println();
                    }
                }
                break;

                case 4: {
                    System.out.println("Terminando");
                    break;
                }
                default:{
                    System.out.println("Opcion invalida");
                }
            }
        }while(opcion != 4);

    }
}
