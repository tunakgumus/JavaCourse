package Day05_IfStatements;

import java.util.Scanner;

public class C04_IfStatementsSorular {

    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf = scan.next().charAt(0);

        if (girilenHarf== 'o' || girilenHarf=='O'){
            System.out.println("Ocak");
        }
        if (girilenHarf== 'ş' || girilenHarf=='Ş'){
            System.out.println("Şubat");
        }
        if (girilenHarf== 'm' || girilenHarf=='M'){
            System.out.println("Mart,Mayıs");
        }
        if (girilenHarf== 'n' || girilenHarf=='N'){
            System.out.println("Nisan");
        }
        if (girilenHarf== 'h' || girilenHarf=='H'){
            System.out.println("Haziran");
        }
        if (girilenHarf== 't' || girilenHarf=='T'){
            System.out.println("Temmuz");
        }
        if (girilenHarf== 'a' || girilenHarf=='A'){
            System.out.println("Ağustos,Aralık");
        }
        if (girilenHarf== 'e' || girilenHarf=='E'){
            System.out.println("Eylül,Ekim");
        }
        if (girilenHarf== 'k' || girilenHarf=='K'){
            System.out.println("Kasım");
        }





    }


    ;
}
