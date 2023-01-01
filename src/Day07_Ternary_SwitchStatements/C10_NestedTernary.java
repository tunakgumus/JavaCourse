package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C10_NestedTernary {
    public static void main(String[] args) {
        //: Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
        //yazdirin
        //Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        //uygun olani yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(sayi>=0? (sayi%2==0 ? "cift sayi": "tek sayi") : (sayi<=-100? "3 basamakli" :"3 basamakli degil"));
    }
}
