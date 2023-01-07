package Day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_sifreKontrolu {
    public static void main(String[] args) {
        // Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

        //sifre kontrolunu bir methodda yapin true / false dondurun
        //main method da donen sonucu kontrol ettirip basari ile olsuturuldu
        //oluncaya kadar devam edip sifreyi tekrar isteyin
        Scanner scan = new Scanner(System.in);
        boolean sifreTekrar= true;
        String sifre = "";

        while (sifreTekrar){

                System.out.println("lutfen bir sifre giriniz");
                sifre = scan.nextLine();

            if(sifreKontrolEt(sifre)){
            System.out.println("sifre basari ile olsuturuldu");
            sifreTekrar =false;
            }
        }
        }
    public static boolean sifreKontrolEt(String sifre) {
            int toplam = 0;
            if (!(sifre.charAt(0) <= 'z' && sifre.charAt(0) >= 'a')) {
                toplam++;
                System.out.println("Lutfen ilk harfi kucuk harf olarak giriniz");
            }
            if (!(sifre.charAt(sifre.length() - 1) <= '9' && sifre.charAt(sifre.length() - 1) >= '0')) {
                    toplam++;
                    System.out.println("Lutfen son harfi rakam giriniz");
            }
            if (sifre.contains(" ")) {
                    toplam++;
                    System.out.println("sifre bosluk icermemeli");
                }
            if (!(sifre.length() >= 10)) {
                    toplam++;
                    System.out.println("sifre en az 10 karakter olmali");
                }
            if (toplam == 0) {
                return true;
            } else return false;
        }
    }
