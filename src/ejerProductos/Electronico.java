package ejerProductos;

public class Electronico extends Producto {
    private int potencia;

    public Electronico(String nombre, double precio,int potencia) {
        super(nombre, precio);
        this.potencia = potencia;
    }


    /**
     * Devuelve true si la potencia del producto no supera los 100 W
     * @return true o false
     */
    public boolean esEficiente(){
        return (potencia < 100);
    }

    /**
     * Si el electronico paramtro tiene mas potencia devuelve true, sino false
     * @param otro o
     * @return r
     */
    public boolean compararPotencia(Electronico otro){
        boolean resultado = false;
            if (otro != null){
                if (potencia < otro.potencia)
                    resultado = true;
            }
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString() + "Electronico{" +
                "potencia=" + potencia +
                '}';
    }
}
