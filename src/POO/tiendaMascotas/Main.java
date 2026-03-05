package POO.tiendaMascotas;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("Perrito",Sexo.MASCULINO,"Pastor aleman");
        Mascota p2 = new Perro("Perra",Sexo.MASCULINO,"Golden retriever");


        Mascota cria = p1.cruzar(null);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(cria);


    }
}
