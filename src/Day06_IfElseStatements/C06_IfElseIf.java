package Day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        double not = scan.nextDouble();
        if (not > 100 && not < 0) System.out.println("Geçersiz Not");
        else if (not >= 85) {
            System.out.println("Notunuz : AA");
        } else if (not >= 65) {
            System.out.println("Notunuz : BB");
        } else if (not >= 50) {
            System.out.println("Notunuz : CC");
        } else System.out.println("Notunuz : FF");
    }
}
