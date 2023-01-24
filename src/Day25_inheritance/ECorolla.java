package Day25_inheritance;

public class ECorolla extends DToyota {
    ECorolla(){
        System.out.println("Parametresiz corolla Cons calisti");
    }
    String model= "Corolla";
    String uretimYeri= "Sakarya";

    public static void main(String[] args) {
        ECorolla cor1 = new ECorolla();

    }
}
