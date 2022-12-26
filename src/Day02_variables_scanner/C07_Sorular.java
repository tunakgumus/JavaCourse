package Day02_variables_scanner;

import java.util.Scanner;

public class C07_Sorular {
    public static void main(String[] args) {
        /*
    Sorular (Variables ve Scanner)
Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String girilenIsim = scan.nextLine();
        System.out.println("lütfen yaşınızı girin");
        int girilenYas = scan.nextInt();
        System.out.println("Cinseyetinizi girin");
        char cinsiyet = scan.next().charAt(0);
        if (cinsiyet == 'e'){
            System.out.println("erkek");
        } else {
            System.out.println("kadın");
        }







      /*


Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
degerlerini degistirin(swap).//

       */

    }


}
