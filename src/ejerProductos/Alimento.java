package ejerProductos;

public class Alimento extends Producto {
    private int calorias;

    public Alimento(String nombre,double precio,int calorias) {
        super(nombre,precio);
        this.calorias = calorias;
    }

    public boolean esBajoCalorias(){
        return (calorias < 100);
    }

    /**
     * Si el alimento parametro tiene mas calorias entonces devuelve true, false en caso contrario
     * @param alimento otro alimento
     * @return true o false
     */
    public boolean compararCalorias(Alimento alimento){
        boolean resultado = false;
            if (alimento != null){

                if (calorias < alimento.calorias){
                    resultado = true;
                }
            }
        return resultado;

    }


    @Override
    public String toString() {
        return super.toString() + "Alimento{" +
                "calorias=" + calorias +
                '}';
    }


}
