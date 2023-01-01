package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C17_SwitchStatementSorular {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay sayisi  giriniz");
        int ay = scan.nextInt();

        switch (ay){
            case 12:
            case 1:
            case (2):
                System.out.println("kis");
                break;
            case(3):
            case (4):
            case(5):
                System.out.println("ilkbahar");
                break;
            case (6):
            case(7):
            case 8:
                System.out.println("yaz");
                break;
            case (9):
            case(10):
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("geçerli bir ay sayisi giriniz");
        }
    }

}
