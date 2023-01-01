package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C16_SwitchStatementSorular {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan = new Scanner(System.in);
        System.out.println("ISTQB kisaltmasinda anlamini ogrenmek istediginiz harfi giriniz");
        char girilenHarf = scan.next().charAt(0);
        girilenHarf = Character.toUpperCase(girilenHarf);
        switch (girilenHarf){
            case 'I' :
                System.out.println("INTERNATIONAL");
                break;
            case 'S' :
                System.out.println("SOFTWARE");
                break;
            case 'T' :
                System.out.println("TESTING");
                break;
            case 'Q' :
                System.out.println("QUALIFICATIONS");
                break;
            case 'B' :
                System.out.println("BOARD");
            default:
                System.out.println("Gecerli bir harf giriniz");


        }
    }

}
