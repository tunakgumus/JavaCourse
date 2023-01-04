package Day09_StringManipulation;

public class C08_LastIndexOf {
    public static void main(String[] args) {


        //verilen str da cok kelimesi
        // hic kullanilmamis
        //bir kere kullanilmis
        //birden fazla kullanilmis
        //sonuclarindan uygun olani yazdirin
        String str = "Javayi iyi ogrenmem icin cok calismam lazim";
        int ilkDeger = str.indexOf("cok");
        int sonDeger = str.lastIndexOf("cok");

        if (!str.contains("cok")) System.out.println("hic kullanilmamis");
        else {
            if (ilkDeger==sonDeger) System.out.println("bir kere kullanilmis");
            else if (ilkDeger<sonDeger) {
                System.out.println("2 kere kullanilmistir");
            }
        }
    }
}
