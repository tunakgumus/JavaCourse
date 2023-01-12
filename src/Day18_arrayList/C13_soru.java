package Day18_arrayList;

import java.util.Scanner;

public class C13_soru {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        //bir liste olarak bize donduren bir method olusturun.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi =scan.nextInt();
        for (int i = sayi; i >=3 ; i--) {

            System.out.println(i + " sayinin fibonacci sayilari : " + C12_soru.fibonacciList(i));

        }
    }

}
