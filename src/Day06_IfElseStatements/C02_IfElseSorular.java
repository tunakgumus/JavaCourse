package Day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseSorular {
    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        // kucukse “Maalesef kaldin” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        double not = scan.nextDouble();
        if (not>= 50) System.out.println("Sinifi Gectin");else System.out.println("Maalesef Kaldin");

    }
}
