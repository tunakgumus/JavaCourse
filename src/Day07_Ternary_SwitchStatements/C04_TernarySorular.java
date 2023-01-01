package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C04_TernarySorular {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir deger giriniz");
        int input = scan.nextInt();
        System.out.println(input%5==0 ? "5'in tam kati" : "5'in kati degil");
    }

}
