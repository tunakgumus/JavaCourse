package Day28_exceptions;

import java.util.Scanner;

public class C08_illegalArgumentExceptions {
    public static void main(String[] args) {
        // Kullanicidan yasini girmesini isteyin
        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();
        try {
            if(yas<0){
               throw new IllegalArgumentException("hata");
            }else {
                System.out.println("yas kaydedildi");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            e.getMessage();

        }
    }
}
