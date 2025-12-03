package POO;
public class Main {
    public static void main(String[] args){

        CuentaBancaria cuenta1 = new CuentaBancaria("israel", 10, 1);
        CuentaBancaria cuenta2 = new CuentaBancaria("sal", 50, 2);


        cuenta1.depositar(500);


        if (cuenta1.transferir(500, cuenta2)){
            System.out.println("Transferencia realizada con exito");
            System.out.println("Saldo actual: "+cuenta1.getSaldo());
            System.out.println("----------");
        }else{
            System.out.println("Transferencia fallida");
        }

        cuenta1.retirar(10);
        System.out.println("Saldo actual: "+cuenta1.getSaldo());


    }
}
