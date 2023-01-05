package Day11_forLoops;

public class C12_Soru09 {
    public static void main(String[] args) {
        //  Kullanicidan bir String isteyin ve String’i tersten yazdirin. ve kaydedin
        String str = "Java ogrenmek icin cok calismak lazim";
        String str2 = "";
        for (int i = str.length()-1; i >=0; i--) {
            str2+= str.substring(i,i+1);
            
        }
        System.out.print(str2);
    }
}
