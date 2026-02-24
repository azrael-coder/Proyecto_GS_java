package manejoFechas;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Times {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(2005, Month.SEPTEMBER,8);

        DayOfWeek dia = DayOfWeek.of(2);
        dia.plus(2);

        System.out.println(fecha);

        Year anio = Year.now();
        System.out.println(anio.isLeap());


        //HORAS
        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        //PA FECHAS Y HORAS
        LocalDateTime fecha3 = LocalDateTime.now();
        System.out.println(fecha3);
    }
}
