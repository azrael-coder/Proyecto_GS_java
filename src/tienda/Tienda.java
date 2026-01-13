package tienda;

public class Tienda {
    private String nombre;
    private String direccion;
    private Producto p1;
    private Producto p2;
    private Producto p3;

    Tienda(){
        nombre=null;
        direccion=null;
        p1=null;
        p2=null;
        p3=null;
    }

    Tienda(String nombre, String direccion,  Producto p1, Producto p2, Producto p3 ){
        this.nombre= nombre;
        this.direccion= direccion;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String mostrarProductos(){
        String resultado = "";

        if (p1==null){
            resultado+= "La tienda no tiene el producto1";
        } else {
            resultado += p1.mostrarInfo() + "\n";
        }

        if (p2==null){
            resultado+= "La tienda no tiene el producto1";
        } else {
            resultado += p2.mostrarInfo() + "\n";
        }

        if (p3==null){
            resultado+= "La tienda no tiene el producto1";
        } else {
            resultado += p3.mostrarInfo() + "\n";
        }


        return resultado;
    }

    public String venderProducto(String nombre, int cantidad) {
        double tVenta = 0;
        String resultado = "No hay stock";

        if (p1.getNombre().equalsIgnoreCase(nombre) && cantidad <= p1.getStock()) {
            resultado = p1.reducirStock(cantidad);
            tVenta = p1.getPrecio() * cantidad;

        } else if (p2.getNombre().equalsIgnoreCase(nombre) && cantidad <= p2.getStock()) {
            resultado = p2.reducirStock(cantidad);
            tVenta = p2.getPrecio() * cantidad;

        } else if (p3.getNombre().equalsIgnoreCase(nombre) && cantidad <= p3.getStock()) {
            resultado = p3.reducirStock(cantidad);
            tVenta = p3.getPrecio() * cantidad;
        }



        return resultado + "\n"+ "Precio: "+tVenta+"€";
    }
}
