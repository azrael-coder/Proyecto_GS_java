package ejerProductos;

public abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(){}

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        if (precio > 0) {
            this.precio = precio;
        }
    }


    public double descuento(float descuento) {
        if (descuento > 0 && descuento <= 100) {
            precio = (precio * descuento) / 100;
        }

        return precio;
    }

    public boolean esMasBaratoQue(Producto otro) {
        boolean resultado = false;



        return resultado;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
