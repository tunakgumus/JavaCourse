package Day09_StringManipulation;

import java.util.Scanner;

public class C06_IndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String girilenCumle= scan.nextLine();
        if (!girilenCumle.contains("cok")) System.out.println("Cumlede cok ile baslayan kelime yok");
        else {
            int cokIndexi = girilenCumle.indexOf("cok");
            int boslukIndexi = girilenCumle.indexOf(" ",cokIndexi);
            System.out.println(girilenCumle.substring(cokIndexi,boslukIndexi));

        };

    }
}
