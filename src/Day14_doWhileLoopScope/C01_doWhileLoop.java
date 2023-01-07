package Day14_doWhileLoopScope;

import java.util.Scanner;

public class C01_doWhileLoop {
    public static void main(String[] args) {
        //kullanicidan istedigi kadar sayi alin , kullanici 0 a basarsa islemi bitirip toplayin
        int girilenSayi = 1;
        int toplam = 0 ;
        Scanner scan = new Scanner(System.in);

        while (girilenSayi!=0){
            System.out.println("Lutfen toplanmak icin bir sayi giriniz");
            girilenSayi= scan.nextInt();
            toplam+= girilenSayi;

        }
        System.out.println("girilen sayilarin toplami : " + toplam);
    }
}
