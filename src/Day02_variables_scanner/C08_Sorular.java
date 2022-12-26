package Day02_variables_scanner;

import java.util.Scanner;

public class C08_Sorular {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        int tamSayi= scan.nextInt();
        double dbl = scan.nextDouble();
        System.out.println("Girilen Sayilarin Toplami :" + (tamSayi+dbl));
        System.out.println("Girilen Sayilarin Carpimi " + tamSayi*dbl);

    }
}
