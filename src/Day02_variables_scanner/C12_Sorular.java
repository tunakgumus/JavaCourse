package Day02_variables_scanner;

import java.util.Scanner;

public class C12_Sorular {
    public static void main(String[] args) {
       // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("İkinci Sayiyi Giriniz");
        int sayi2 = scan.nextInt();
        int sayi3=0;
        sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;
        System.out.println(sayi2);
        System.out.println(sayi1);
    }
}
