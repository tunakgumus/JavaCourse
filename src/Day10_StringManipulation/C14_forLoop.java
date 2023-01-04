package Day10_StringManipulation;

public class C14_forLoop {
    public static void main(String[] args) {
        //input olarak verilen sayidan baslayarak input olarak verilen bitiş noktasina kadar 7ser 7ser arttir
        // tüm sayilari ,toplam kac sayi oldugunu , ve sayilar toplamini yazdir.
        int inputBas = 340;
        int inputBit = 1563;
        int sayiAdedi=0;
        int toplam=0;
        for (int i = inputBas; i <=inputBit ; i+=7) {

                sayiAdedi++;
                toplam = toplam + i;
                System.out.print(i + " ");
        }
        System.out.println("\nToplam sayi adedi :  " + sayiAdedi + " " +
                "\nSayilar toplami: " + toplam);
    }
}
