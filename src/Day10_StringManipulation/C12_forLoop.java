package Day10_StringManipulation;

public class C12_forLoop {
    public static void main(String[] args) {
        //1den 1000 e kadar tüm sayilari yazdirin ve en son sayilarin toplamini yazdirin
        int toplam = 0;

        for (int i = 0; i <=1000 ; i++) {
            toplam = toplam + i ;
            System.out.print(i);
        }
        System.out.println("\nSayilarin toplami: " + toplam);
    }

}
