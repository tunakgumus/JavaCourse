package Day21_staticKeyword;

public class C01_staticBlock {
    C01_staticBlock(){
        System.out.println("cons calisti");
    }
    public static void main(String[] args) {
        System.out.println("main method calisti");
    }
    static {
        System.out.println("static blok calisti");
    }
    static {
        System.out.println("alttaki static blok calisti");
    }
}
