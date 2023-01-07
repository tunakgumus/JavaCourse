package Day15_scope_Arrays;

public class C03_baskaClassaErisme {
    public static void main(String[] args) {
        System.out.println(C01_Hastane.hastaneIsmi);
        C01_Hastane.method1();
        C01_Hastane per1 = new C01_Hastane();
        System.out.println(per1.personelIsmi);
        System.out.println(per1.hastaneIsmi);

        per1.personelIsmi="belkız";
        per1.personelAdresi="istanbul";
        per1.hastaneAdres="Uskudar";

        System.out.println(per1.personelIsmi);
        System.out.println(per1.personelAdresi);
        System.out.println(per1.hastaneAdres);
    }
}
