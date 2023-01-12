package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler.remove("Z"));
        System.out.println(harfler);
        System.out.println(harfler.remove(0));
        System.out.println(harfler);

        List<String> yeniListe = new ArrayList<>();
        yeniListe.add("C");
        yeniListe.add("D");
        yeniListe.add("T");

        System.out.println(yeniListe.removeAll(harfler));
        System.out.println(yeniListe);
    }
}
