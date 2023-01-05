package Day12_methodCreation;

public class C08_palindrome {
    public static void main(String[] args) {
        //verilen bir stringin palindrome olup olmadigini yazdirin
        String str = "anastasa mum satsana";
        String tersstr = C07_terseCevirme.MetniTersCevir(str);
        if (str.equals(tersstr)) System.out.println("Bu bir palindromedur");
        else System.out.println("Bu bir palindrome degildir");
    }

}