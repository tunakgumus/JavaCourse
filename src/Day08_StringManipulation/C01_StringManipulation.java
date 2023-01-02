package Day08_StringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde
        //hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz");
        String gun = scan.nextLine();
        gun = gun.toLowerCase();
        switch (gun){
            case "pazartesi" :
                System.out.println("Simdi calisma zamani tatile 5 gun var");
                break;
            case "sali" :
                System.out.println("Simdi calisma zamani tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println("Simdi calisma zamani tatile 3 gun var");
                break;
            case "persembe":
                System.out.println("Simdi calisma zamani tatile 2 gun var");
                break;
            case "cuma" :
                System.out.println("Simdi calisma zamani tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar" :
                System.out.println("Simdi dinlenme zamani" );
                break;
            default:
                System.out.println("gecerli bir gun giriniz");
        }
    }
}
