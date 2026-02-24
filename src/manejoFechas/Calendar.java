package manejoFechas;

import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {
        GregorianCalendar fecha1 = new GregorianCalendar(2024,2,23);

        int anio = fecha1.get(GregorianCalendar.YEAR);
        int mes = fecha1.get(GregorianCalendar.MONTH);
        int dia = fecha1.get(GregorianCalendar.DAY_OF_WEEK);

        fecha1.set(2005,9,8);
        fecha1.add(GregorianCalendar.YEAR,1);

        System.out.println(anio+","+mes+","+dia );

    }
}
