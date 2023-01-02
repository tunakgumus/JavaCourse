package Day08_StringManipulation;

import java.util.Random;

public class C06_Length {
    public static void main(String[] args) {
        String str = "Java her gecen gün daha da güzelleşiyor";
        //sondan 3.karakteri yazdirin
        System.out.println(str.charAt(str.length()-3));


        Random rnd= new Random();
        int index = rnd.nextInt(str.length());
        System.out.println(str.charAt(index));
    }
}
