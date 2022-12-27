package Day03_DataCasting_MatematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi = 10;
        String str = "Java Candir";

        String str2 = "123";
        String str3 = "354";


        int str2Int = Integer.parseInt(str2);
        System.out.println(str2Int*2);
        int str3Int = Integer.parseInt(str3);
        System.out.println(str2Int+str3Int);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        char krk1 = '$';
        System.out.println(Character.isDigit(krk1));
        System.out.println(Character.isLetter(krk1));



    }
}
