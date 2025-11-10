package Hoja4;
public class Animacion {
      public static void animacion() throws InterruptedException {
        char [] ruedita = {'|', '/', '-', '\\' };

        for (int i = 0; i < 25; i++){
            IO.print("\rCagando " + ruedita[i % ruedita.length]);
            Thread.sleep(250);
        }
        IO.println("\rCarga completada  \n");
    }
}
