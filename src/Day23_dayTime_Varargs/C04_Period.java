package Day23_dayTime_Varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1989,12,23);
        LocalDate bugun = LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugun);
        System.out.println(yas);
        System.out.println(yas.getYears());
    }
}
