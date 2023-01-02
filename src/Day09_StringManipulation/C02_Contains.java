package Day09_StringManipulation;

public class C02_Contains {
    public static void main(String[] args) {
        String str ="Java ogren mutlu ol";
        System.out.println(str.contains("ogren"));
        System.out.println(str.contains(" "));
        System.out.println(str.contains("ogren") && str.contains("mutlu"));
    }
}
