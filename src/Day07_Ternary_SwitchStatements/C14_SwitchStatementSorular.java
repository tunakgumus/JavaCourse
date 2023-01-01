package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C14_SwitchStatementSorular {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir rakam  giriniz");
        int rakam = scan.nextInt();

        switch (rakam) {
            case (1):
                System.out.println("bir");
                break;
            case (2):
                System.out.println("iki");
                break;
            case (3):
                System.out.println("üç");
                break;
            case (4):
                System.out.println("dort");
                break;
            case (5):
                System.out.println("bes");
                break;
            case (6):
                System.out.println("alti");
                break;
            case (7):
                System.out.println("yedi");
                break;
            case (8):
                System.out.println("sekiz");
                break;
            case (9):
                System.out.println("dokuz");
                break;
            default:
                System.out.println("geçerli bir rakam giriniz");
        }
    }
}
