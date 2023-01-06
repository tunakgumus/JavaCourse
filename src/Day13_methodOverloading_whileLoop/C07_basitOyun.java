package Day13_methodOverloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_basitOyun {
    public static void main(String[] args) {
        //random olarak 1 ile 100 arasi bir sayi belirleyin
        //kullanicidan bilmesini isteyin, kullanici her deger girdiginde tahmin ile karsilastirip
        // yukarı yada asagi diyerek kullaniciyi yonlendirin
        // kullanici 3 veya daha az tahminle bilirse " woaaw"yazin
        // 4 - 8 tahminde bildiyse " aferin"
        //daha fazla tahminde bildiyse " basarisiz" yazdirin

        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100);
        int tahminSayisi =1;
        int tahmin = 0;
        Scanner scan = new Scanner(System.in);
        while (tutulanSayi != tahmin) {
            System.out.println("lutfen bir sayi giriniz");
            tahmin = scan.nextInt();
            if(tahmin==tutulanSayi){
                if (tahminSayisi <= 3 ) System.out.println("woaaw");
                else if (tahminSayisi <= 8) System.out.println("aferin");
                else System.out.println("basarisiz");
            }
            else if (tahmin > tutulanSayi) {
                System.out.println("tahmini kücültün");
                tahminSayisi++;
            }
            else {
                System.out.println("tahmini büyütün");
                tahminSayisi++;
            }
            }
        }
    }
