package Day19_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C07_soru {
    public static void main(String[] args) {
        // //Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //    //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String str = scan.nextLine();
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf = scan.nextLine().charAt(0);
        int sayac=0;

        String[] harfler =str.split("");
        for (String each:harfler
             ) {
            if(each.contains(Character.toString(girilenHarf))){
                sayac++;
            }

        }
        if(sayac==0) System.out.println("harf cumlede kullanilmamis");
        else System.out.println("harf, cumlede " + sayac + " kere kullanilmistir.");

    }
}