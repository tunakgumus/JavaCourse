package Day23_dayTime_Varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_localDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);
    }
}
