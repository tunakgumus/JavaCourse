package Day11_forLoops;

import java.util.Scanner;

public class C13_Soru10 {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                System.out.println("sayi asal degildir");
                break;
            }
            else System.out.println("sayi asaldir");
                    break;

        }
    }
}
