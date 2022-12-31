package Day06_IfElseStatements;

import java.util.Scanner;

public class C12_NestedIfElse {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        char cinsiyet = scan.nextLine().charAt(0);
        cinsiyet = Character.toUpperCase(cinsiyet);
        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'E') {
            if (yas >= 65) {
                System.out.println("emekli olabilirsiniz");
            }
                if (yas < 65) {
                    System.out.println((65 - yas) + " yil sonra emekli olacaksin");
                }
        }
        else if (cinsiyet == 'K') {
            if (yas >= 60) {
                System.out.println("emekli olabilirsiniz");
            }
            if (yas < 60) {
                System.out.println((60 - yas) + " yil sonra emekli olacaksin");

            } else System.out.println("Cinsiyet bilgisi hatalidir");
        }

    }
}
