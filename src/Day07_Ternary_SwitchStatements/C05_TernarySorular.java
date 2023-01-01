package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C05_TernarySorular {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarını giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eskenar ucgen" : "eskenar ucgen degil");

    }
}
