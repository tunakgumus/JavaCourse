package Day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseSorular {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char krk = scan.nextLine().charAt(0);
        if(krk>='A' && krk<='Z') System.out.println(krk);
        else {

            System.out.println((char)(krk - 32) );
            System.out.println(Character.toUpperCase(krk));

        }
    }
}
