package POO;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GestorCuentas registrar = new GestorCuentas();
        String opcion;

        do{
            registrar.registro();


            System.out.println("Quiere cerrar sesion?[s/n]: ");
             opcion = sc.nextLine();



        }while(opcion.equalsIgnoreCase("n"));





        /*
        if (c1.transferir(500, c2)){
            System.out.println("Transferencia realizada con exito");
            System.out.println("Saldo actual de: "+c1.getTitular()+"\t"+c1.getSaldo());
            System.out.println("----------");
        }else{
            System.out.println("Transferencia fallida");
        }
        */

    }
}
