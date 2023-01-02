package Day09_StringManipulation;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str = "Java ile kodlama çok güzel";
        System.out.println(str.indexOf("ile"));
        System.out.println(str.indexOf('v'));
        System.out.println(str.indexOf('d'));
        System.out.println(str.indexOf('i',5));

        //2. o nun indexinin bulun
        int ilkIndex = (str.indexOf("o"));
        System.out.println(str.indexOf('o', ilkIndex+1));
    }

}
