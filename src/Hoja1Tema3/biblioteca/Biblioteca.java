package Hoja1Tema3.biblioteca;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private Libro l1;
    private Libro l2;
    private Libro l3;

    Biblioteca(String nombre, String direccion,  Libro libro1, Libro libro2, Libro libro3) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.l1 = libro1;
        this.l2 = libro2;
        this.l3 = libro3;
    }

    Biblioteca(){}

    public String mostrarCatalogo(){
        String resultado = "";
        if (l1.getTitulo() != null){
            resultado += l1.mostrarInfo()+"\n";
        }else
            resultado += "Libro no disponible"+"\n";


        if (l2.getTitulo() != null){
            resultado += l2.mostrarInfo()+"\n";
        }else
            resultado += "Libro no disponible"+"\n";


        if (l3.getTitulo() != null){
            resultado += l3.mostrarInfo()+"\n";
        }else
            resultado += "Libro no disponible";

        return resultado;
    }


    public String prestarEjemplar(String tituloLibro, int cantidad){
        String resultado = "El titulo no esta disponible";

        if (l1.getTitulo().equalsIgnoreCase(tituloLibro) && cantidad <= l1.getStock()){
            resultado = l1.prestarEjemplar(cantidad);
        }

        return resultado;
    }


}
