package Day12_methodCreation;

public class C07_terseCevirme {
    public static void main(String[] args) {
        //verilen bir stringi tersine cevirip o halini bize donduren bir method olusturun
        String str = "Eylul akgumus";
        str=(MetniTersCevir(str));
        System.out.println(str);


    }
    public static String MetniTersCevir (String str){
        String str2="";
        for (int i = str.length()-1; i >=0; i--) {
            str2+=str.substring(i,i+1);
        }
        return str2;
    }
}
