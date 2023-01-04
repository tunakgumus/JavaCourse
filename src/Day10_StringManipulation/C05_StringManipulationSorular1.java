package Day10_StringManipulation;

import java.util.Scanner;

public class C05_StringManipulationSorular1 {
    public static void main(String[] args) {
        //: Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir cumle yaziniz");
        String str = scan.nextLine();
        if (str.contains("ev") && str.contains("is"))System.out.println("hem ev lazim hem is");
        else if (str.contains("ev")) {
            System.out.println("home home sweet home");
        }else if (str.contains("is"))System.out.println("calismak güzeldir");
        else System.out.println("cok calismam lazim");
    }


}
