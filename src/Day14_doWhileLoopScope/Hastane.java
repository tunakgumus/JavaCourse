package Day14_doWhileLoopScope;

public class Hastane {
    static String HastaneIsmi= "Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";
    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        Hastane p1 = new Hastane();
        p1.personelAdresi="alibeyköy";
        p1.personelIsmi="eylül";
        p1.personelTel="112333444";

        Hastane p2 = new Hastane();
        p2.personelTel="654654650";
        p2.personelIsmi="ahmet";

    }
}
