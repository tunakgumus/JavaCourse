package Day06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseIfSorular {
    public static void main(String[] args) {
        //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("mesafeyi km olarak yazin");
        int km = scan.nextInt();
        System.out.println("çevirmek istediğiniz uzunluk birimini yazın");
        String istenenBirim = scan.next();
        if (istenenBirim.equals("metre") || istenenBirim.equals("m")){
            System.out.println("mesafenin metre cinsinden değeri: " + km * 1000);
        } else if (istenenBirim.equals("santimetre")||istenenBirim.equals("cm")) {
            System.out.println("mesafenin santimetre cinsinden değeri: " + km * 1000*100);
        }else {
            System.out.println("istediğiniz birim sisteme kayıtlı değildir");
        }


    }
}
