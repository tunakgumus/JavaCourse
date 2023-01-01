package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();
        if (girilenSayi>=0 && girilenSayi<=9) System.out.println("girilen sayi rakamdir");
        else if (girilenSayi>=10 && girilenSayi<=99) System.out.println("iki basamakli sayi");
        else if (girilenSayi>=100) System.out.println("buyuk sayi");
    }
}
