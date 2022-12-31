package Day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIfSorular {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        Scanner scan = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz");
        char cinsiyet = scan.nextLine().charAt(0);
        cinsiyet=Character.toUpperCase(cinsiyet);
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'E' && yas > 65) System.out.println("Emekli olabilirsin");
        else if (cinsiyet == 'E' && yas < 65) {
            System.out.println((65 - yas) + " yil sonra emekli olabilirsin");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println((60 - yas) + " yil sonra emekli olabilirsin");
        }

    }
}
