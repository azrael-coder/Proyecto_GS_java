package tienda;

public class Tienda {
    private String nombre;
    private String direccion;
    private String producto1;
    private String producto2;
    private String producto3;

    Tienda(){
        nombre=null;
        direccion=null;
        producto1=null;
        producto2=null;
        producto3=null;
    }

    Tienda(String nombre, String direccion, String producto1, String producto2, String producto3 ){
        this.nombre= nombre;
        this.direccion= direccion;
        this.producto1= producto1;
        this.producto2= producto2;
        this.producto3= producto3;
    }

    public String mostrarProductos(){
        String resultado = "";

            if (producto1 == null){
                resultado = "No hay producto1";
            }else {
                //  resultado = Producto.mostrarInfo();
            }

            return resultado;
    }
}
