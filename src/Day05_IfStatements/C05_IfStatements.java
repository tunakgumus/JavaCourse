package Day05_IfStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı yazınız");
        int sayi = scan.nextInt();
        if (sayi % 5 == 0) {
            System.out.println("5e bölünür");
        }
        if (sayi % 3 == 0) {
            System.out.println("3e bölünür");
        }
    }
}