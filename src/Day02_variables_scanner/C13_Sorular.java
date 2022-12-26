package Day02_variables_scanner;

import java.util.Scanner;

public class C13_Sorular {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
       // degerlerini degistirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("İkinci Sayiyi Giriniz");
        int sayi2 = scan.nextInt();

        sayi1 = sayi2;
        sayi2 = sayi1;

        System.out.println(sayi1 );
        System.out.println(sayi2);
    }
}
