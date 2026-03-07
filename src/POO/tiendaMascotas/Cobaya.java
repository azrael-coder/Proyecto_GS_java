package POO.tiendaMascotas;

public class Cobaya extends Mascota{
    private String colorPelo;
    public Cobaya(String nombre, Sexo sexo, String colorPelo) {
        super(nombre, sexo);
        this.colorPelo = colorPelo;
    }


    @Override
    public void decirAlgo() {
        System.out.println("Chillido");
    }

    @Override
    public void gustosAlimentarios() {
        System.out.println("eno de alta calidad (80%), complementado con verduras frescas (15-20%) ricas en vitamina C");
    }

    @Override
    public Mascota cruzar(Mascota pareja) {
        Mascota cria = null;

        if (pareja instanceof Cobaya && super.getSexo() != pareja.getSexo()) {
            if (asignarSexo() == Sexo.MASCULINO ){
                cria = new Cobaya(generarNombres(Sexo.MASCULINO),Sexo.MASCULINO, "Marron");
            }
            else
                cria = new Cobaya(generarNombres(Sexo.FEMENINO), Sexo.FEMENINO,"Blanco");
        }

        return cria;
    }

    public String toString() {
        return super.toString()+ " Tipo: Cobaya";
    }
}
