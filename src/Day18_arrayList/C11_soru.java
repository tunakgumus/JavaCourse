package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_soru {
    public static void main(String[] args) {
        //Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun
        List<String> isimler = C10_soru.isimList();
        String istenmeyenHarf2 ="a";
        System.out.println(istenmeyenHarfCikarma(isimler, istenmeyenHarf2));
    }

    private static List istenmeyenHarfCikarma(List<String> isimler,String istenmeyenHarf) {
        List<String> isimler2 = new ArrayList<>();
        for (int i = 0; i < isimler.size(); i++) {
            if (!isimler.get(i).contains(istenmeyenHarf)){
                isimler2.add(isimler.get(i));
            }
        }
        return isimler2;
    }

}
