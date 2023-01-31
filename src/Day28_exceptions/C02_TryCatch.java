package Day28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birbirine bolmek icin 2 sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        try {
            System.out.println("İki sayinin bolumu : " + sayi1/sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayi 0 olamaz");
            e.printStackTrace();
        }
    }
}
