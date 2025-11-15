package codinBat;
import java.util.Scanner;
public class dateFashion {
    public static int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8)
             return 2;
        else if (you <= 2 || date <= 2)
            return 0;
         else
            return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tu estilo: ");
        int estilo = sc.nextInt();

        System.out.println("Estilo de tu pareja: ");
        int pareja = sc.nextInt();

        System.out.println(dateFashion.dateFashion(estilo, pareja));
    }
}
