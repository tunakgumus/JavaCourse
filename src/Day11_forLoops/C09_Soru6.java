package Day11_forLoops;

import java.util.Scanner;

public class C09_Soru6 {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 20'den kucuk bir sayi giriniz");
        int sayi = scan.nextInt();
        int faktoryel =1;
        System.out.print(sayi+"!= ");
        for (int i = sayi; i >=2 ; i--) {
            faktoryel=faktoryel*i;
            System.out.print(i +" * ");
        }
        System.out.println("1=" + faktoryel);
    }
}
