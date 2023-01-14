package Day20_Constructor;

public class Rope {
    public static void swing (){
        System.out.print("swing ");
    }
    public void climb (){
        System.out.println("climb");
    }
    public static void play(){
        swing();
        //climb();
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();

        Rope rope2 = new Rope();
        rope2.play();
    }
}
