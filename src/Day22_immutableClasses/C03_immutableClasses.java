package Day22_immutableClasses;

public class C03_immutableClasses {
    public static void main(String[] args) {
        String str = "Java";
        str.replace("J","H");
        System.out.println(str);

        str=str.toUpperCase();
        System.out.println(str);
    }
}
