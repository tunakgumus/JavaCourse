package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C09_TernarySorular {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(sayi>0 ? sayi : (0-sayi));
    }
}
