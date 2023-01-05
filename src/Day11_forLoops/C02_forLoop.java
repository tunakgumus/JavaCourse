package Day11_forLoops;

public class C02_forLoop {
    public static void main(String[] args) {
        // input olarak verilen bir stringte indexi tek sayi olanlari kucuk
        // çift sayi olanlari buyuk harfle yazdirin
        String input ="Java candir, Selenyum heyecandir";
        for (int i = 0; i <input.length() ; i++ ){
            System.out.print    (i%2==0
                                ? input.substring(i,i+1).toUpperCase()
                                : input.substring(i,i+1).toLowerCase()
            );

        }


    }
}
