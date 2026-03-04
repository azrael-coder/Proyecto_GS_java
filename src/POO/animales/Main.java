package POO.animales;

public class Main {
    public static void main(String[] args) {

        Perro p1 = new Perro("Perro","Mamifero",Sexo.MASCULINO,"Marron");
        Gato g1 = new Gato("Gato con botas","Mamifero",Sexo.MASCULINO,true,4.5f);
        Animal medusa = new Medusa("Mortal","Carabela Portugesa",Sexo.FEMININO,true);
        Leon l1 = new Leon("Simmba","Mamifero",Sexo.MASCULINO,5);

        System.out.println(p1.voz());
        System.out.println(g1.voz());
        System.out.println(g1.vozDurmiendo());

        System.out.println(l1.voz());
        System.out.println(l1.vozDurmiendo());

        System.out.println(Sonido.vozBostezar());
    }
}
