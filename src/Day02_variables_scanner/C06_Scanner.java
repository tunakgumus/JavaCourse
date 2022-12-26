package Day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int girilenSayi = scan.nextInt();
        System.out.println("Girilen Sayinin Karesi: " + girilenSayi*girilenSayi);
    }
}
