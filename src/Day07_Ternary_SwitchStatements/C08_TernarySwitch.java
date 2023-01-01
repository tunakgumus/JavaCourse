package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C08_TernarySwitch {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println(sayi1>sayi2 ? sayi2 : "");
        System.out.println(sayi2>sayi1 ? sayi1 : "");
    }
}
