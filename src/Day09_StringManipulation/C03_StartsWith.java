package Day09_StringManipulation;

public class C03_StartsWith {
    public static void main(String[] args) {
        String str = "Java mutluluktur";
        System.out.println(str.startsWith("Ja"));
        System.out.println(str.startsWith("Java mutluluktur"));
        System.out.println(str.startsWith("mutlu",5));
    }
}
