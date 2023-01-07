package Day15_scope_Arrays;

import Day14_doWhileLoopScope.Hastane;

public class C01_Hastane {
    static String hastaneIsmi= "Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";
    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        C01_Hastane per1 =new C01_Hastane();
        System.out.println(per1.personelIsmi);
        System.out.println(per1.personelAdresi);
        System.out.println(per1.personelTel);

        per1.personelIsmi="fidan";
        per1.personelAdresi="Germany";
        per1.personelTel="+4900932403249";

        C01_Hastane per2= new C01_Hastane();
        System.out.println(per2.personelIsmi);

        per1.personelIsmi="Yusuf";
        System.out.println(per2.personelIsmi);
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi);
        System.out.println(per1.personelIsmi);

        System.out.println(hastaneIsmi);
        System.out.println(per1.hastaneIsmi);
        per2.hastaneIsmi="Java Hastanesi";
        System.out.println(hastaneIsmi);
    }
    public static void method1(){
        System.out.println(hastaneAdres);
    }
    public void method2 (){
        System.out.println(hastaneIsmi + "method2");
    }
}
