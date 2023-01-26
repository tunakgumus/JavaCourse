package Day26_inheritance;

class okul{
    String okulIsmi = "Yildiz Koleji";
    String telefon = "3123456543";

}

public class C01_sinif extends okul {
    String sinif = "11-C";
    String telefon = "3122343434";
    C01_sinif (String telefon){
        System.out.println(telefon);
        System.out.println(this.telefon);
        System.out.println(super.telefon);

        System.out.println(okulIsmi);
        System.out.println(this.okulIsmi);
        System.out.println(super.okulIsmi);

        System.out.println(sinif);
        System.out.println(this.sinif);
        // System.out.println(super.sinif);

    }

    public static void main(String[] args) {
        C01_sinif obj = new C01_sinif("4222342323");
    }
}
