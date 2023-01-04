package Day10_StringManipulation;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str = "Java heyecandır";
        System.out.println(str.replaceFirst("a", "A"));
        System.out.println(str.replaceFirst("\\W", "*"));
    }
}
