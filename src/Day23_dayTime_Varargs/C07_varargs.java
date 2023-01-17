package Day23_dayTime_Varargs;

public class C07_varargs {
    public static void main(String[] args) {
        //Kac tane String arguman yazilirsa yazilsin
        //Argümentlerin en uzun olanini yazdirsin
        //Not: en uzun kelime olarak birden fazla varsa ilkini yazdirsin
        enUzunuYazdir("ahmet","mehmet","murat","berkan");
        
    }

    private static void enUzunuYazdir(String ... kelimeler) {
        String enUzunKelime="" ;
        for (String each:kelimeler
             ) {
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println(enUzunKelime);
    }
}
