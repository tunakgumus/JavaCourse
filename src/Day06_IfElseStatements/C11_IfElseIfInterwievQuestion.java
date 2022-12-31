package Day06_IfElseStatements;

import java.util.Scanner;

public class C11_IfElseIfInterwievQuestion {
    public static void main(String[] args) {
        //Kullanicidan artik yil olup olmadigini kontrol
        //etmek icin yil girmesini isteyin.
        //Kural 1: 4 ile bolunemeyen yillar artik yil
        //degildir
        //Kural 2: 4 ile bolunup 100 ile bolunemeyen
        //yillar artik yildir
        //Kural 3: 4’un kati olmasina ragmen 100 ile
        //bolunebilen yillardan sadece
        //400’un kati olan yillar artik yildir

        Scanner scan = new Scanner(System.in);
        System.out.println("yılı girin");
        int yil = scan.nextInt();

        if ((yil%4!=0)) {
            System.out.println("artık yıl değildir");
        } else if (yil%4==0 && yil%100!=0) {
            System.out.println("artık yildir");
        } else if (yil%4==0 && yil%100==0 && yil%400==0) {
            System.out.println("artik yildir");
        }
        else {
            System.out.println("artik yil değildir");
        }


    }





}
