package tienda;

public class Tienda {
    private String nombre;
    private String direccion;
    private Producto p1;
    private Producto p2;
    private Producto p3;


    Tienda(String nombre, String direccion, Producto p1, Producto p2, Producto p3){
        this.nombre= nombre;
        this.direccion= direccion;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    Tienda(){

    }


    //KK
    public String mostrarProductos(){
        String resultado = "";

            if (p1 != null)
                resultado = p1.mostrarInfo();

            if (p2 != null)
                resultado= p2.mostrarInfo();

            if (p3 != null)
                resultado = p3.mostrarInfo();

            if (resultado.equalsIgnoreCase(""));
            resultado = "No hay de ese producto";

            return resultado;
    }

    public String venderProducto(String nombre, int cantidad){
        double totalVenta = 0;
        String resultado = "";
        if (p1.getNombre().equalsIgnoreCase(nombre) && cantidad > p1.getStock()){
            p1.setStock(p1.getStock() - cantidad);

            totalVenta = cantidad * p1.getPrecio();
            resultado = "Total a pagar: "+totalVenta;

        } else if (p2.getNombre().equalsIgnoreCase(nombre) && cantidad > p2.getStock()) {
            p2.setStock(p2.getStock() - cantidad);

            totalVenta = cantidad * p2.getPrecio();
            resultado = "Total a pagar: "+totalVenta;

        } else if (p3.getNombre().equalsIgnoreCase(nombre) && cantidad > p2.getStock()) {
            p3.setStock(p3.getStock() - cantidad);

            totalVenta = cantidad * p3.getPrecio();
            resultado = "Total a pagar: "+totalVenta;
        }

        //Poner el aviso por si no hay

        return resultado;
    }
}
