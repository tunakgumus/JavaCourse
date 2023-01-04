package Day10_StringManipulation;

import java.util.Scanner;

public class C08_Soru4 {
    public static void main(String[] args) {
        // Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sifre giriniz\n" +
                "sifre - ilk harf kucuk harf olmali\n" +
                "        //- son karakter rakam olmali\n" +
                "        //- sifre bosluk icermemeli\n" +
                "        //- uzunlugu en az 10 karakter olmali");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);
        char sonkrk = sifre.substring(sifre.length() - 1).charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) System.out.println("İlk harf kucuk olmali");
        else if (sifre.contains(" ")) System.out.println("lutfen sifrede bosluk birakmayiniz");
        else if (sonkrk <= 9 && sonkrk >= 1) System.out.println("Lutfen son karakteri rakam giriniz");
        else if (sifre.length() <= 9) System.out.println("Sifre 10 haneli olmali");
        else System.out.println("sifreniz basariyla kaydedilmistir");
        }


        }