package Day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {
        int sayi = 20;
        //sayiyiyi 3 arttır

        sayi = sayi+3;
        sayi +=3;
        System.out.println(sayi);

        //sayiyi 2 azaltın

        sayi= sayi-2;
        sayi -=2;
        System.out.println(sayi);

        sayi=10;
        System.out.println(sayi++);
        System.out.println(sayi);

        sayi=10;
        System.out.println(++sayi);
    }
}

