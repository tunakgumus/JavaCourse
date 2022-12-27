package Day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C06_Sorular {
    public static void main(String[] args) {
        /*
        Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 adet sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        double ort = (sayi1+sayi2+sayi3)/3;
        System.out.println(ort);
    ------------------------------------------------------------------------------

Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char krk= scan.next().charAt(0);
        System.out.println((char)(krk+1) + "," +
                            (char)(krk+2) + "," +
                            (char)(krk+3));

----------------------------------------------------------------------------------------
Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 adet sayi giriniz");
        int sayi1 = scan.nextInt();
        byte sayi2 = (byte)sayi1;
        System.out.println(sayi2);
----------------------------------------------------------------------------------------

Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
isleminin sonucununun tamsayi kismini yazdirin.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 adet sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        int bolum = (int) (sayi1/sayi2);
        System.out.println(bolum);

    }
}
