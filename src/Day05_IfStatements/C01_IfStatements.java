package Day05_IfStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        //Ogrenciden notu alıp harf değeri olarak yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu yazınız");
        double not = scan.nextDouble();
        if (not < 49.99) {
            System.out.println("DD , Maalesef kaldın");
        }
        if (not >= 50 && not < 64.99) {
            System.out.println("CC, tebrikler geçtin");
        }
        if (not >= 65 && not < 84.99) {
            System.out.println("BB, tebrikler geçtin");
        }
        if (not >= 85 && not <= 100) {
            System.out.println("AA, tebrikler geçtin");
        }
    }
}