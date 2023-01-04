package Day10_StringManipulation;

import java.util.Scanner;

public class C10_Soru6 {
    public static void main(String[] args) {
        //Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin.
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir ifade giriniz");
        String str = scan.nextLine();

        int strUzunluk = str.length();
        if (strUzunluk % 2 == 0){
            int merkez = str.length()/2 ;
            System.out.println(str.substring(0,merkez) + " :) " + str.substring(merkez,str.length()));
        } else if (!(strUzunluk % 2 == 0)){
            int merkez = str.length()/2;
            System.out.println(str.substring(0,merkez) + " :( " + str.substring(merkez+1,str.length()));
        }


    }
}
