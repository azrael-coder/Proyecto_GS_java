package POO;
public class Main {
    public static void main(String[] args){

        CuentaBancaria cuenta = new CuentaBancaria("israel", 500);

        CuentaBancaria cuenta2 = new CuentaBancaria("sal", 40);


        cuenta.transferir(502, cuenta2);

        cuenta.mostrarInfo();

        cuenta2.mostrarInfo();



    }
}
