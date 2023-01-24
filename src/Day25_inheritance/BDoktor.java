package Day25_inheritance;

public class BDoktor extends APersonel{
    public static void main(String[] args) {
        BDoktor dr1 =new BDoktor();
        dr1.isim="Kemal";
        dr1.soyisim="Bulut";
        System.out.println(dr1.isim +","+ dr1.soyisim + ","+ dr1.telefon );
        dr1.maas();
        dr1.ozelSigorta();
        dr1.nobet();
    }
    public void maas(){
        System.out.println("Doktor maasi 30 * 8 * 25 : " + 6000);
    }
    public void nobet(){
        System.out.println("Doktorlar haftada 1 gün nb tutarlar");
    }


}
