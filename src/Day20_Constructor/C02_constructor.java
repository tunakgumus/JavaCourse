package Day20_Constructor;

public class C02_constructor {
    public static void main(String[] args) {
        karesiniYazdir(5);

        Car car1 =new Car("BMW","5.20",2020,15000,"Beyaz");
        System.out.println(car1);

        System.out.println("===============================================");

        Car car2 =new Car("Tofas","Sahin",2010);
        System.out.println("Sahin bilgileri : " + car2  );
        System.out.println("===============================================");
        Car car3 =new Car("Toyota","Corolla",2016,"Gri");
        System.out.println(car3);
    }
    public static void karesiniYazdir(int sayi){
        System.out.println(sayi*sayi);
    }
}
