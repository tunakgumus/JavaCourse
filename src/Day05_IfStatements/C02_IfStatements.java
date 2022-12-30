package Day05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı al + ise pozitif
        // 100 ile 999 arasında ise pozitif 3 basamaklı bir sayı
        // 3 ile bölünebiliyorsa "3'ün katı"
        // birler basamağı 7 ise mükemmel yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı yazınız");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            System.out.println("Pozitif sayı");

        }
        if (sayi >= 100 && sayi < 1000) {
            System.out.println("Üç basamaklı sayı");
        }
        if (sayi % 3 == 0) {
            System.out.println("Üçün katı");
        }
        if (sayi % 10 == 7) {
            System.out.println("mükemmel");
        }
    }
}
