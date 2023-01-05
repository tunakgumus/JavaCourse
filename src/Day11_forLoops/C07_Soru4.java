package Day11_forLoops;

import java.util.Scanner;

public class C07_Soru4 {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif tamsayi olan baslangic ve bitis degeri giriniz");
        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();
        int  toplam = 0;

        //if (bitis<baslangic) System.out.println("Baslangic degeri bitisten buyuk olamaz");
        // else {
            for (int i = baslangic; i <=bitis; i++) {
                toplam=toplam+i;
                System.out.print(i + " ");
            }
            System.out.println("\nSayilarin toplami :" + toplam);

    }
}
