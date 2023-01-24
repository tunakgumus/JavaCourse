package Day25_inheritance;

public class APersonel  {
   protected String isim = "İsim Atanmadi";
   protected String soyisim = "Soyisim Atanmadi";
   protected String telefon= "Telefon Atanmadi";

   protected void maas (){
       System.out.println ("Hastanemizde asgari ücret 1700 eurodur");
   }
   protected void ozelSigorta (){
       System.out.println("TÜm personelin saglk sigortasi vardir");
   }
    private void privateMethod (){
        System.out.println("Private method calisti");
    }
}
