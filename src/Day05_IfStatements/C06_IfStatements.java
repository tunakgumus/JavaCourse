package Day05_IfStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
    //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunlularını yazınız");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3) System.out.println("eşkenarüçgendir");
    }
}
