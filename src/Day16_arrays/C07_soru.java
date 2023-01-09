package Day16_arrays;

import java.util.Scanner;

public class C07_soru {
    public static void main(String[] args) {
        //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kontrol etmek istediginiz sayiyi yaziniz");
        int kontrolEdilenSayi =scan.nextInt();
        int [] arr={4,6,7,9,1,5,96,4,8,6,2,5};
        elemanKontrol(arr,kontrolEdilenSayi);
    }
    public static void elemanKontrol (int[] arr,int sayi){
        int kullanilanSayi =0;
        for (int i = 0; i <arr.length; i++) {
        if(arr[i]==sayi) {
            kullanilanSayi++;
        }
        }
        if(kullanilanSayi==0) System.out.println("istenen eleman arrayde yoktur");
        else System.out.println("istenen eleman arrayde " + kullanilanSayi + " tane vardir");
    }
}
