package Day34_maps_nestepMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {
        Map<String,Integer> harfSayilariMap = new TreeMap<>();

        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        harfSayilariMap.put("A",20);
        harfSayilariMap.put("C",harfSayilariMap.get("C")*2);

        harfSayilariMap.compute("D",(k,v)-> v+5);

        System.out.println(harfSayilariMap.computeIfPresent("T", (k, v) -> v - 3));

        harfSayilariMap.computeIfAbsent("T", v->3);


    }
}
