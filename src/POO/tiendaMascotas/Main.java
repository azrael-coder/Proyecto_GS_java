package POO.tiendaMascotas;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("Perrito",Sexo.MASCULINO,"Pastor aleman");
        Perro p2 = new Perro("Perra",Sexo.FEMENINO,"Pastor ALEMAN");
        Mascota cria = p1.cruzar(p2);

        Gato g1 = new Gato("Gato",Sexo.MASCULINO,"Gato naranja");
        Gato g2 = new Gato("Gata",Sexo.FEMENINO,"Gato negro");
        Mascota criaGato = g1.cruzar(g2);

        Cobaya cobaya1 = new Cobaya("cobaya1",Sexo.MASCULINO,"Con manchas");
        Cobaya cobaya2 = new Cobaya("cobaya2",Sexo.FEMENINO,"Gris");
        Mascota criaCobaya = cobaya1.cruzar(cobaya2);

        Mascota[] mascotas = {p1,p2,cria,g1,g2,criaGato, criaCobaya};

        for (Mascota mascota : mascotas) {
            System.out.println(mascota);

            if (mascota instanceof Gato gato){
                System.out.println(gato.ronronear());
            }
        }



    }
}
