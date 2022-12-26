package Day02_variables_scanner;

import java.util.Scanner;

public class C11_Sorular {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Çemberin yarı çapını giriniz");
        double yariCap = scan.nextDouble();

        System.out.println("Çemberin cevresi: " + 2*yariCap+'£');
        System.out.println("Çemberin alanı: " + yariCap*yariCap+'£');


    }
}
