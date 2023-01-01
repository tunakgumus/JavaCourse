package Day07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir deger giriniz");
        int input = scan.nextInt();
        System.out.println(input>=100 ? input*2 : input+10);
    }
}
