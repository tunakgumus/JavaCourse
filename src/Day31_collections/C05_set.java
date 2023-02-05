package Day31_collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_set {
    public static void main(String[] args) {
        Set<String> ogrenciler =new TreeSet<>();

        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");

        System.out.println(ogrenciler);

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler);

        ogrenciler.add("Furkan");
        System.out.println(ogrenciler);


    }
}
