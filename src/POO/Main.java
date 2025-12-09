package POO;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        String nombre = input.nextLine();

        System.out.println("Introduzca su saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Introduzca un numero de cuenta: ");
        int idCuenta = input.nextInt();

        //VALIDAR EL NUMERO DE CUENTA
        do{
            if (idCuenta < 0) {
                System.out.println("NÚMERO INVALIDO, INTRODUZCA OTRO");
                idCuenta = input.nextInt();
            }
        }while(idCuenta < 0);



        CuentaBancaria c1 = new CuentaBancaria(nombre, saldo, idCuenta);

        c1.mostrarInfo();


        /*if (c1.transferir(500, c2)){
            System.out.println("Transferencia realizada con exito");
            System.out.println("Saldo actual de: "+c1.getTitular()+"\t"+c1.getSaldo());
            System.out.println("----------");
        }else{
            System.out.println("Transferencia fallida");
        }
        */

    }
}
