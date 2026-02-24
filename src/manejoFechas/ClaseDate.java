package manejoFechas;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ClaseDate {
    public static void main(String[] args) {

      Date d1 = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println(d1.toString());


        System.out.println(df.format(d1));
        System.out.println(df2.format(d1));
        System.out.println(df3.format(d1));
        System.out.println(df4.format(d1));

    }
}
