package Day14_doWhileLoopScope;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        //kullanicidan istedigi kadar sayi alin , kullanici 0 a basarsa islemi bitirip toplayin
        int girilenSayi = 0;
        int toplam = 0 ;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("toplamak icin sayi giriniz");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;

        }while (girilenSayi!=0);
        System.out.println(toplam);
    }
}
