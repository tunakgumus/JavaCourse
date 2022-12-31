package Day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseSorular {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();
        if (yas>= 65) System.out.println("Emekli olabilirsin");
        else System.out.println("emekli olman için " + (65 -yas) + " yil calisman gerek");
    }
}
