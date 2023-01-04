package Day10_StringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str = "Ja1va 56Guz,zel-dir";
        System.out.println(str.replace("1","")
                                .replace("56","")
                                .replace(",z","")
                                .replace("-",""));


        String str2= "Ja1v,5a 87gu-ze41ld69,ir";
        str2= str2.replaceAll("\\d","");
        System.out.println(str2);
        str2= str2.replace(" ", "5");
        str2= str2.replaceAll("\\W", "");
        str2= str2.replace("5", " ");
        System.out.println(str2);

        //asagidaki harf sayisini bulun

        String str3= "Ali Can, Merve Star, Mark Tom";
        str3 = str3.replaceAll("\\W", "");
        System.out.println(str3);
        System.out.println(str3.length());


    }
}
