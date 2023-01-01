package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C07_TernarySorular {
    public static void main(String[] args) {
        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir not giriniz");
        int not = scan.nextInt();
        System.out.println(not>=50 ? "geçtiniz" : "kaldiniz");
    }
}
