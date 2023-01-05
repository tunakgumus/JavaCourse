package Day11_forLoops;

import java.util.Scanner;

public class C08_Soru5 {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 20'den kucuk bir sayi giriniz");
        int sayi = scan.nextInt();
        int faktoryel =1;
        for (int i = sayi; i >=2 ; i--) {
            System.out.print(i +" ");
            faktoryel=faktoryel*i;
        }
        System.out.println("\n" + faktoryel);
    }
}
