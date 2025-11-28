package POO;
public class Main {
    public static void main(String[] args){

        CuentaBancaria cuenta = new CuentaBancaria("Azrael", 500);

        cuenta.depositar(300);
        cuenta.retirar(200);

        cuenta.mostrarInfo();
    }
}
