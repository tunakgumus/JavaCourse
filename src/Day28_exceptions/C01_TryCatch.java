package Day28_exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birbirine bolmek icin 2 sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        try {
            System.out.println("İki sayinin bolumu : " + sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Bolecek sayi 0 olamaz");
        }
    }
}
