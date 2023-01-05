package Day11_forLoops;

public class C03_asalSayi {
    public static void main(String[] args) {
        //input olarak verilen bir sayinin asal sayi olup olmadigini kontrol ediniz
        int input = 29;
        String sonuc = "Sayi asaldir";
        for (int i = 2; i <= input - 1; i++) {
            if (input % i == 0) {
                System.out.println(sonuc = "sayi asal degildir");
                break;

               }
            System.out.println(sonuc);
            break;

        }
    }
}