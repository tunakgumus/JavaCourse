package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C13_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gün sayısı  giriniz");
        int gun = scan.nextInt();

        switch (gun){
            case 1:
            case (2):
            case(3):
            case (4):
            case(5):
                System.out.println("hafta içi");
                break;
            case (6):
            case(7):
                System.out.println("h sonu");
                break;
            default:
                System.out.println("geçerli bir gün sayisi giriniz");
        }
    }
}
