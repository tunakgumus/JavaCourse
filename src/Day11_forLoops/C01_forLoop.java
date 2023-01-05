package Day11_forLoops;

import java.util.Scanner;

public class C01_forLoop {
    public static void main(String[] args) {
        //kullanicidan bir char alip ondan sonraki 10 karakteri yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);
        for (int i = 1; i <=10 ; i++) {
            System.out.print((char) (krk+i) + " ");
        }

    }
}
