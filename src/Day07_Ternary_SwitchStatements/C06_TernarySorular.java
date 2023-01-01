package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C06_TernarySorular {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char harf = scan.next().charAt(0);
        System.out.println(harf>='a' && harf<='z' ? "Kucuk harf" : "buyuk harf");
    }
}
