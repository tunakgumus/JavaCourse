package Day14_doWhileLoopScope;

import java.util.Scanner;

public class C05_doWhileLoopSoru2 {
    public static void main(String[] args) {
        //- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //bulunuz, tamkare ise true değilse false yazdırınız.
        //Ornek : input : 16, output: 4

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int kullaniciSayisi=scan.nextInt();
        int bolen=1;
   do {
        if(kullaniciSayisi/bolen==bolen){
            System.out.println("true");
            break;
        }else {
           bolen++;
        }
        if (bolen==kullaniciSayisi-1) System.out.println("false");
   }while (bolen<kullaniciSayisi);
    }
}
