package Day23_dayTime_Varargs;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C01_localTime {
    public static void main(String[] args) {
        LocalTime zaman =LocalTime.now();
        System.out.println(zaman);
        System.out.println("======================");
        System.out.println(zaman);
        System.out.println(zaman.getMinute());
        System.out.println(zaman.withSecond(0).withNano(0));
        System.out.println(zaman.withNano(0));
        System.out.println(zaman.withSecond(1).withNano(1));
        System.out.println(zaman.plusHours(100));
        System.out.println(("============================================="));
        System.out.println("islem öncesi zaman" + LocalTime.now());
        for (int i = 0; i <10000 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("islem sonrasi zaman" + LocalTime.now());


    }
}
