package Day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseSorular {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char krk = scan.nextLine().charAt(0);
        if(krk>='A' && krk<='Z') System.out.println("Karakter buyuk harftir");else System.out.println("Büyük harf degil");
    }
}
