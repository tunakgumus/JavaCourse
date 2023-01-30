package Day27_Overriding;

public class CAvciKuslar extends BKuslar{
    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme (){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidirler");
    }
    public void gaga (){
        System.out.println("gagalidirlar");
    }

    public static void main(String[] args) {
        CAvciKuslar krt1 = new CAvciKuslar();
        krt1.hareket();
        krt1.beslenme();
        krt1.pence();
        krt1.gaga();
        krt1.kanat();
        krt1.solunum();
        krt1.cogalma();
        krt1.omur();

        BKuslar krt2 = new CAvciKuslar();
        krt2.hareket();
        krt2.beslenme();
        // krt2.pence();
        krt2.gaga();
        krt2.kanat();
        krt2.solunum();
        krt2.cogalma();
        krt2.omur();

        AHayvanlar krt3 = new CAvciKuslar();

        krt3.hareket();
        krt3.beslenme();
        // krt3.pence();
        // krt3.gaga();
        // krt3.kanat();
        krt3.solunum();
        krt3.cogalma();
        krt3.omur();
    }
}
