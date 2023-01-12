package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_indexOf {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.indexOf("Z"));
        System.out.println(harfler.lastIndexOf("Z"));

        harfler.add("Z");

        System.out.println(harfler.indexOf("Z"));
        System.out.println(harfler.lastIndexOf("Z"));

        System.out.println(harfler.indexOf("M"));
        System.out.println(harfler.lastIndexOf("M"));


    }
}
