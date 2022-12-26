package Day02_variables_scanner;

import java.util.Scanner;

public class C09_Sorular {
    public static void main(String[] args) {
         /* Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John5
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Isminizi Giriniz");
        String Isim = scan.next();
        System.out.println("Lütfen Soy Isminizi Giriniz");
        String SoyIsim = scan.next();
        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas = scan.nextInt();

        System.out.println("Isminiz : " + Isim +
                "\nSoyisminiz: " + SoyIsim +
                "\nYasiniz: " + yas +
                "\n Kaydiniz basariyla tamamlanmistir."

        );


    }
}
