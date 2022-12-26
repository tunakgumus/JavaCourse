package Day02_variables_scanner;

import java.util.Scanner;

public class c10_Sorular {
    public static void main(String[] args) {

     /*
Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
yazdirin.

      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Diktörtgenin Kenar Uzunluklarını Giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("Diktörtgenin alanı: " + kenar1*kenar2);
}
}