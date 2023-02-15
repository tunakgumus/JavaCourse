package Day34_maps_nestepMaps;

import java.util.TreeMap;

public class C06_treeMapMethodlari {
    public static void main(String[] args) {
        TreeMap<String,Integer> harfSayilariMap = new TreeMap<>();

        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap);

        System.out.println(harfSayilariMap.subMap("C", "F"));
        System.out.println(harfSayilariMap.descendingMap());
        System.out.println(harfSayilariMap.lowerKey("E"));

        System.out.println(harfSayilariMap.floorKey("E"));
        System.out.println(harfSayilariMap.higherKey("J"));

        System.out.println(harfSayilariMap.headMap("D",true));
        System.out.println(harfSayilariMap.tailMap("C",false));

        System.out.println(harfSayilariMap.pollFirstEntry());
        System.out.println(harfSayilariMap);

        harfSayilariMap.pollLastEntry();
        System.out.println(harfSayilariMap);
    }
}
