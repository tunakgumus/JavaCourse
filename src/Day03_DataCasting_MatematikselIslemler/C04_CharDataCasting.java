package Day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println('a'-32);

        System.out.println((char) ('a'-32));

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char chr = scan.next().charAt(0);
        System.out.println(chr);
        System.out.println((char)chr + "," +
                (char)(chr+1) + "," + (char)(chr+2) + "," +  (char)(chr+3));
    }
}
