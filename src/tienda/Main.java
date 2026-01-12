package tienda;

public class Main {
    public static void main (String[] args){

        Producto p1 = new Producto("Agua Mineral",1,20);
        Producto p2 = new Producto("Baguette", 2.0, 15);
        Producto p3 = new Producto("Leche", 1.5, 10);

        Tienda t1 = new Tienda("MiniMarket", "Avenida Central 45", p1, p2, p3);


        System.out.println( t1.venderProducto("Agua Mineral", 3));

        System.out.println(t1.mostrarProductos());
    }
}
