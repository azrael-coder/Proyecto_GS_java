package POO.vehiculosHerencia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("Ford",300,21f,30000, LocalDate.of(1970,3,15),Modelo.ALTO,4,"clasico");
        Coche c2 = new Coche("SEAT",150,6f,23000, LocalDate.of(2013,3,15),Modelo.INTERMEDIO,2,"sport");
        Coche c3 = new Coche("Volkswagen ",134,4f,18000, LocalDate.of(2015,3,15),Modelo.BASICO,4,"moderno");

        Moto m1 = new Moto("Harley-davidson",89,8f,12300,LocalDate.of(2026,4,16), Modelo.INTERMEDIO,6,"Horquilla convencional SHOWA™ de 41 mm con tecnología de doble válvula flexible, Pletinas de dirección de aluminio.");
        Moto m2 = new Moto("Honda",55,6f,3000,LocalDate.of(1999,4,16), Modelo.ALTO,5,"S");
        Moto m3 = new Moto("Yamaha",23,2.4f,2300,LocalDate.of(2003,4,16), Modelo.BASICO,3,"Hidraulica");

        Camion ca1 = new Camion("Mercedes-Benz",160, 12.5f,45000.0, LocalDate.of(2023, 5, 15),Modelo.BASICO,2, 3500.0);
        Camion ca2 = new Camion("Volvo",540, 32.8f, 120000.0, LocalDate.of(2022, 11, 10), Modelo.ALTO,5, 24000.0);
        Camion ca3 = new Camion("Scania", 450, 28.5f, 95000.0, LocalDate.now(), Modelo.ALTO,3, 15000.0);


        Vehiculo[] vehiculos = {c1,c2,c3,m1,m2,m3,ca1,ca2,ca3};
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].mostrarVehiculo());

            if (vehiculos[i] instanceof Coche coche) {
                System.out.println(coche.mostrarExtras());
            } else if (vehiculos[i] instanceof Moto moto) {
                System.out.println(moto.incrementoPrecio());
            }  else if (vehiculos[i] instanceof Camion camion) {
                System.out.println(camion.permisoEspecial());
            }
        }

    }
}
