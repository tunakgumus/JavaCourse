package Day33_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_cumledeHarfSayilariniBulma {
    public static void main(String[] args) {
        //Verilen bir cumlede kullanilan her harfin kacar kez oldugunu yazdirin
        //Or: Java Candir
        String cumle = "Java candir";

        cumle=cumle.replaceAll("\\W","");

        String[] cumleArr = cumle.split("");
        Map<String,Integer> kullanimSayilariMap = new HashMap<>();

        for (int i = 0; i <cumleArr.length ; i++) {
            if(!kullanimSayilariMap.containsKey(cumleArr[i])){
                kullanimSayilariMap.put(cumleArr[i],1);
            }else {
                int eskiValue =kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }
        }
        System.out.println(kullanimSayilariMap);
    }

}
