package Day09_StringManipulation;

import java.util.Scanner;

public class C04_EndsWith {
    public static void main(String[] args) {
        String str = "Java ogrenen issiz kalmaz";
        System.out.println(str.endsWith("kalmaz"));
        System.out.println(str.endsWith("Java ogrenen issiz kalmaz"));
        System.out.println(str.endsWith(""));

        //SORU : kullanicidan bir mail alin- mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gmail hesabinizi giriniz");
        String girilenMail = scan.nextLine();

        if (!girilenMail.contains("@")) System.out.println("Gecersiz Mail");
        else if (!girilenMail.contains("gmail.com")) {
            System.out.println("Mail gmail olmali");
        } else if (!girilenMail.endsWith("gmail.com")) {
            System.out.println("Mailde yazim hatasi var");
        }else System.out.println("Kaydiniz basari ile olusturulmustur");
    }
}
