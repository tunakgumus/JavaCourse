package Day24_stringBuilder;

public class EncapsuleClass {
   private int satis;
   private int rapor =100;
   private int halkaAcikSayi=10;
   static int toplamSatis=0;

    public static int getToplamSatis() {
        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis +=this.satis;
    }

}
