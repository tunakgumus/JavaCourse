package Day09_StringManipulation;

public class C07_IlkTest {
    public static void main(String[] args) {
        String str = "1-48 of 68 results for nutella";
        int ofIndex = str.indexOf("of");
        int boslukIndex = str.indexOf(" ",ofIndex);
        int sayi = Integer.parseInt(str.substring(boslukIndex+1,boslukIndex+3));
        if (sayi>= 50) System.out.println("50'den fazla sonuc");
        if (sayi<50) System.out.println("50'den az sonuc");
        System.out.println(sayi);


    }
}
