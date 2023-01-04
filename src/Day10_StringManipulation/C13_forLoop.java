package Day10_StringManipulation;

import java.util.Scanner;

public class C13_forLoop {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis degerleri alin aradaki 5'in katlarini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini girin");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        for (int i =sayi1; i <=sayi2 ; i++) {
            if (i%5==0) System.out.print(i + " ");

        }
    }
}
