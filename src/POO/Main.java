package POO;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){


        CuentaBancaria c1 = new CuentaBancaria( "hans", 50, 1);
        CuentaBancaria c2 = new CuentaBancaria( "javi", 500, 2);



        c1.mostrarInfo();
        c2.mostrarInfo();




        if (c1.transferir(500, c2)){
            System.out.println("Transferencia realizada con exito");
            System.out.println("Saldo actual de: "+c1.getTitular()+"\t"+c1.getSaldo());
            System.out.println("----------");
        }else{
            System.out.println("Transferencia fallida");
        }


    }
}
