package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_soru {
    public static void main(String[] args) {
    // Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.
        System.out.println(isimList());
    }
    public static List isimList (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen listeye eklemek istediginiz isimleri yaziniz,bitirmek icin q ya basin");
        String alinanIsimler="";
        List<String> isimler = new ArrayList<>();
            while (!alinanIsimler.equalsIgnoreCase("q")){
                alinanIsimler = scan.nextLine();
                if (alinanIsimler.equalsIgnoreCase("q"))
                    break;
                isimler.add(alinanIsimler);



            }
            return isimler;
        }
    }
