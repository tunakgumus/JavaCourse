package Day27_Overriding;

public class BKuslar extends AHayvanlar{
    protected void kanat (){
        System.out.println("kanatlidirlar");
    }
    protected void solunum (){
        System.out.println("akcigerlerle solunum yapar");
    }
    protected void gaga(){
        System.out.println("gagalari vardir");
    }
    protected void cogalma (){
        System.out.println("yumurtayla cogalirlar");
    }
}
