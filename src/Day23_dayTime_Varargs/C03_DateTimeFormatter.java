package Day23_dayTime_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MMMM/YY");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MMM/YYY/E");
        System.out.println(ldt.format(format1));
        System.out.println(ldt.format(format2));
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MMM/YYY/E, hh.mm");
        System.out.println(ldt.format(format3));
    }
}
