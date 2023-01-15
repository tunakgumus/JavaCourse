package Day22_immutableClasses;

import java.time.LocalDate;

public class C05_date_time {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.lengthOfMonth());
        System.out.println(tarih.withYear(2014));
        System.out.println(tarih.withMonth(9).withYear(2014));
        System.out.println(tarih.isLeapYear());
        System.out.println(tarih.minusWeeks(78));
        System.out.println(tarih.plusDays(78));
    }
}
