package Day15_scope_Arrays;

public class C02_hastane {
    static String hastaneIsmi= "Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";
    String personelIsmi = "Personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";

    public static void main(String[] args) {
        C02_hastane per1 =new C02_hastane();

        C02_hastane per2 = new C02_hastane();

        per1.personelIsmi="Harun";

        per2.personelAdresi="Cankaya";

        per1.hastaneIsmi="Java Hastanesi";

        System.out.println(per1.personelTel);

        System.out.println(per1.personelIsmi);

        System.out.println(per2.personelIsmi);

        System.out.println(per2.personelAdresi);

        System.out.println(per1.hastaneIsmi);

        System.out.println(per2.hastaneIsmi);

        System.out.println(hastaneIsmi);


    }
}
