package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler);
        //2. indexe F elemanini ekleyin
        harfler.add(2,"F");
        System.out.println(harfler);

        harfler.set(2,"M");
        System.out.println(harfler);


    }
}
