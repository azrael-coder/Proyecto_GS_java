package POO;
import java.util.Scanner;

/*CLASE PARA GESTIONAR LAS CUENTAS (registro, busquedas, etc)*/
public class GestorCuentas {

    void registro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su titular: ");
        String titular = sc.nextLine();

        System.out.println("Ingrese su saldo: ");
        double saldo = sc.nextDouble();
        while (saldo < 0){
            System.out.println("Saldo invalido, introduzca otro: ");
            saldo = sc.nextDouble();
        }

        System.out.println("Ingrese su numero de cuenta: ");
        int numCuenta = sc.nextInt();
        while (numCuenta < 0){
            System.out.println("Numero invalido, introduzca otro: ");
            numCuenta = sc.nextInt();
        }


        CuentaBancaria Cuenta = new CuentaBancaria(titular, saldo, numCuenta);

        System.out.println("Cuenta registrada correctamente");
    }


}
