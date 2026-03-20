package POO.ejerProductos;

public abstract class Producto implements Comparable<Producto>{
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
            precio = precio - (precio * descuento) / 100;
        }

        return precio;
    }

    public boolean esMasBaratoQue(Producto otro) {
        boolean resultado = false;
        if (otro != null) {

            if(precio < otro.precio ) {
                resultado = true;
            }
        }

        return resultado;
    }

    /**
     * Metodo que compara primero el precio de los Productos, y si son iguales los desempata basandose en los atributos propios de cada producto
     * como las calorias o la potencia
     * @param otro producto a comparar
     * @return r
     */
    public int compareTo(Producto otro) {
        int resultado = 0;

        if (esMasBaratoQue(otro)) {
            resultado = -1;
        }
        else if (precio > otro.precio) {
            resultado = 1;
        }
        //Si hay empate en el precio
        else
        if (this instanceof Alimento && otro instanceof Electronico) { // Si el empate es entre un Alimento y un Electronico, el Alimento se coloca antes
            resultado = -1;
        }

        else if (this instanceof Alimento a && otro instanceof Alimento b) { //Si el empate es entre dos Alimentos, se ordenan por calorías de menor a mayor
            if (a.compararCalorias(b)){
                resultado = -1;
            }
            else
                resultado = 1;
        }
        else if (this instanceof Electronico a && otro instanceof Electronico b) { //  Si el empate es entre dos Electronico, se ordenan por potencia de menor a mayor
            if (a.compararPotencia(b)){
                resultado = -1;
            }
            else
                resultado = 1;
        }

        return resultado;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public double getPrecio() {
        return precio;
    }

        public String getNombre() {
            return nombre;
        }
}
