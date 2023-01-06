package Day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_whileLoop {
    //kullanicidan toplamak uzere sayilar alin, girilen sayilarin toplami 500 olur veya gecerse
    //bu kadar sayi yeterli diyip yazdiralim
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam=0;
        while (toplam<500){
            System.out.println("lutfen toplanacak sayilari giriniz");
            int sayi = scan.nextInt();
            toplam = toplam+sayi;
            if (toplam >=500){
                System.out.println("Bu kadar sayi yeter, sayilarin toplami : " + toplam );
            }
        }
    }
}
