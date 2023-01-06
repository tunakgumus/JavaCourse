package Day13_methodOverloading_whileLoop;

import Day12_methodCreation.C03_Method_Asal_Sayi;
import Day12_methodCreation.C07_terseCevirme;
import Day12_methodCreation.C09_fibonacciDizimi;

public class C01_methodCall {
    public static void main(String[] args) {
        //ilk 15 fibonacci sayisini yazdirin
        C09_fibonacciDizimi.fibonacciYazdir(15);
        System.out.println("");

        //asagidaki ifadeyi tersine cevirin
        String str = "bir kere yaparim, yan gelir yatarim";

        System.out.println(C07_terseCevirme.MetniTersCevir(str));

        // asagida verilen cumlenin bir palidrome olup olmadigini yazdirin
        String str2 = "Java candir";
        String str3 = C07_terseCevirme.MetniTersCevir(str2);
        if (str2.equals(str3)) System.out.println("Palindromedur");
        else System.out.println("palindrome degildir");

        //asagidaki sayinin asal olup olmadigini yazdirin
        int sayi = 23;
        boolean sonuc = C03_Method_Asal_Sayi.asalSayiMi(sayi);
        if(sonuc) System.out.println("Girilen " + sayi + " sayisi asaldir");
        else System.out.println("Girilen " + sayi + " sayisi asal degildir");


    }
}
