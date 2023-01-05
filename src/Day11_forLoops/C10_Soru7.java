package Day11_forLoops;

import java.util.Scanner;

public class C10_Soru7 {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        String sayi = scan.next();
        int toplam=0;
        for (int i = 0; i <=sayi.length()-1 ; i++) {
            int sayi2= Integer.parseInt(sayi.substring(i,i+1));
            toplam=toplam+sayi2;
        }
        System.out.println(toplam);
    }
}
