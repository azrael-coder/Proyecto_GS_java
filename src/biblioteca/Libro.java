package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int stock;

    Libro(String titulo, String autor, int anioPublicacion, int stock){
        this.titulo= titulo;
        this.autor= autor;
        this.anioPublicacion= anioPublicacion;
        this.stock= stock;
    }

    Libro(){}



    public String prestarEjemplar (int cantidad){
        String resultado = "";

        if (cantidad <= stock){
            stock -= cantidad;
            resultado = "Prestamo realizado correctamente";
        }
        return resultado;
    }

    public String mostrarInfo(){
        return "Titulo: "+titulo+"\n"+
                "Autor: "+autor+"\n"+
                "Año: "+anioPublicacion+".\n"+
                "Disponibles: "+stock+"\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null)
            this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0)
            this.anioPublicacion = anioPublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock > 0)
            this.stock = stock;
    }
}
