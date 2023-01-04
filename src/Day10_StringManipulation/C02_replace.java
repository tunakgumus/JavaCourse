package Day10_StringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str = "Java ogren, adana ye";
        System.out.println(str.replace('a','A'));
        System.out.println(str.replace(" ",""));
        System.out.println(str.replace("Java","Yazilim"));

        String str2 = "1-16 of over 100,000 results for \"apple\"";
        int overIndex = str2.indexOf("over");
        int resultsIndex = str2.indexOf("results");
        String sonuc = str2.substring(overIndex+5,overIndex+12);
        System.out.println(sonuc);
        sonuc=sonuc.replace(",","");
        System.out.println(sonuc);
        int sonucSonHal = Integer.parseInt(sonuc);
        System.out.println(sonucSonHal);
        if (sonucSonHal>=100000) System.out.println("test passed");
        else System.out.println("test failed");
    }
}
