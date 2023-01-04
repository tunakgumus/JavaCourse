package Day10_StringManipulation;

import java.util.Scanner;

public class C09_Soru5 {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim = scan.nextLine();
        int isimUzunluk = isim.length();
        int soyisimUzunluk = soyIsim.length();
        if (isimUzunluk>=soyisimUzunluk){
            String isimIlkHarf = isim.substring(0,1).toUpperCase();
            char soyisimIlkHarf = soyIsim.charAt(0);
            isim = isim.toLowerCase();
            soyIsim = soyIsim.toLowerCase();
            System.out.println("\n Isim : " + isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase() +
                    "\n Soyisim : " + soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase());
        } else {
            System.out.println("Isim : " + isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase() +
                    "\nSoyisim : " + soyIsim.toUpperCase());
        }

    }
}
