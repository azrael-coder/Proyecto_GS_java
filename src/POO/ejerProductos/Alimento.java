package POO.ejerProductos;

public class Alimento extends Producto {
    private int calorias;
    public final int BAJO_CALORIAS = 100;
    public Alimento(String nombre,double precio,int calorias) {
        super(nombre,precio);
        this.calorias = calorias;
    }

    public boolean esBajoCalorias(){
        return (calorias < BAJO_CALORIAS);
    }

    /**
     * Si el alimento parametro tiene mas calorias entonces devuelve true, false en caso contrario
     * @param otro alimento
     * @return true o false
     */
    public boolean compararCalorias(Alimento otro){
        boolean resultado = false;
            if (otro != null){

                resultado = (calorias < otro.calorias);
            }
        return resultado;

    }



    public Alimento clone(){
        Alimento clone = new Alimento(new String (super.getNombre()), super.getPrecio(), calorias);
        return clone;
    }




    @Override
    public String toString() {
        return super.toString() + "Alimento{" +
                "calorias=" + calorias +
                '}';
    }


}
