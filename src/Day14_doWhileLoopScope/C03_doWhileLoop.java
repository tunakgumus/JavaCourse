package Day14_doWhileLoopScope;

import java.util.Scanner;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        //verilen baslangic ve bitis karakterleri dahil aradaki tum karakterleri yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir baslangic degeri giriniz");
        char baslangic = scan.next().charAt(0);
        System.out.println("lutfen bir bitis degeri giriniz");
        char bitis = scan.next().charAt(0);
        do {
            System.out.print(baslangic + " ");
            baslangic=(char)(baslangic+1);

        }    while (baslangic <= bitis);
    }
}
