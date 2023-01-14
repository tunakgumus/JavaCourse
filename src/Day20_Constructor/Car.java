package Day20_Constructor;

public class Car {
    String marka = " toyota";
        String model = "Model belirtilmemiş";
        int yil;
        int km;
        String renk;

        public Car (String mrk, String mdl, int yl, int kmetre, String rnk){
            marka=mrk;
            model=mdl;
            yil=yl;
            km=kmetre;
            renk=rnk;

        }
        public Car(){

        }

    public Car(String marka, String model, int yil) {
            this.marka=marka;
            this.model=model;
            this.yil=yil;
    }

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\nmarka='" + marka + '\'' +
                "\nmodel='" + model + '\'' +
                "\nyil=" + yil +
                "\nkm=" + km +
                "\nrenk='" + renk + '\'' +
                '}';
    }

    public static void hareket(){
        System.out.println("Tüm arabalar hareket eder");

    }
}
