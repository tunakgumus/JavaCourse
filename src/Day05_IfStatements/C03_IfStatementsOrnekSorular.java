package Day05_IfStatements;

import java.util.Scanner;

public class C03_IfStatementsOrnekSorular {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı yazınız");
        int sayi = scan.nextInt();
        if (sayi%5 == 0 ){
            System.out.println("5in tam katı");
        }
    }
}
