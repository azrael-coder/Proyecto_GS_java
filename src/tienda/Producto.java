package tienda;

/**
 * @author azrael
 * @version 0.1
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    Producto (){
        this(null, 0.0, 0);
    }

    Producto(String nombre, double precio, int stock){
        if (nombre != null)
            this.nombre= nombre;
        if (precio>=0)
            this.precio = precio;
        if (stock>0)
            this.stock= stock;
    }

    /**
     *
     * @param cantidad la cantidad a reducir
     * @return indica si no hay suficiente stock
     */
    public String reducirStock(int cantidad){
        String mensaje;
        if (cantidad > 0 && stock > cantidad){
            stock -= cantidad;
            mensaje = "Reduccion de stock correcta, stock actual: " + stock;
        }
        else
            mensaje = "No hay stock suficiente";

        return mensaje;
    }

    public String mostrarInfo(){
        return "Producto: "+nombre+" ,Precio: "+precio+"€"+" ,Stock: "+stock;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0)
            this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock>0)
            this.stock = stock;
    }
}
