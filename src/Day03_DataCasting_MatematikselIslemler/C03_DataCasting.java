package Day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        double sayi1 = 25;
        int sayi2 = 6;

        System.out.println(sayi1/sayi2 );
        // kullanicidan 2 tamsayi alin
        // 1.tamsayiyi 2.ye bolup sonucu ondalik olarak yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 adet sayı giriniz");
        double sayi3 = scan.nextDouble();
        double sayi4 = scan.nextDouble();
        System.out.println(sayi3/sayi4);

    }
}
