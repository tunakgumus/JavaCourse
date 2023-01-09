package Day16_arrays;

public class C04_soru {
    public static void main(String[] args) {
        //verilen bir arrayde istenen bir harfi iceren kelimeleri silip yerine null yazin
        String [] isimler={"Huseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf= "u";
        for (int i = 0; i < isimler.length ; i++) {
            if(isimler[i].contains("u")){
                isimler[i]=null;
            }
            System.out.println(isimler[i]);


            
        }
    }
}
