package Hoja1Tema3.biblioteca;

public class Main {
    public static void main(String[] args){

        Libro l1 = new Libro("El retorno del rey"," JRR Tolkien",1955, 5);
        Libro l2 = new Libro("Don Quijote de la Mancha", " Miguel de Cervantes", 1605, 3);
        Libro l3 = new Libro("El Principito"," Antoine de Saint-Exupéry",1943, 7);

        Biblioteca bi = new Biblioteca("Biblioteca Central", "Plaza Mayor 12",l1,l2,l3);

        System.out.println(bi.prestarEjemplar("El retorno del rey",3));
        System.out.println(bi.prestarEjemplar("Don Quijote de laMancha",2));

        System.out.println(bi.mostrarCatalogo());

    }
}
