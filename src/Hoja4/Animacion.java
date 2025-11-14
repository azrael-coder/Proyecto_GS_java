package Hoja4;
public class Animacion {
      public static void animacion() throws InterruptedException {
        char [] ruedita = {'|', '/', '-', '\\' };

        for (int i = 0; i < 25; i++){
            System.out.print("\rCagando " + ruedita[i % ruedita.length]);
            Thread.sleep(250);
        }
        System.out.println("\rCarga completada  \n");
    }
}
