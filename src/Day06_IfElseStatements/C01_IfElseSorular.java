package Day06_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseSorular {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("3 kenar uzunluklarını giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();
        if(kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eşkenar üçgen");
        } else {
            System.out.println("eşkenar üçgen değil");
        }

    }
}
