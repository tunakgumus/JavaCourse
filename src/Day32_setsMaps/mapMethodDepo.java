package Day32_setsMaps;

import java.util.*;

public class mapMethodDepo {
    public static Map<Integer, String> ogrenciMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {
        Collection<String> valuesCollection = ogrenciMap.values();
        for (String each : valuesCollection
        ) {
            String[] arr = each.split("-");
            if (arr[0].equalsIgnoreCase(isim)) {
                return true;
            }
        }
        return false;
    }

    public static void soyIsimleOgrenciArama(Map<Integer, String> ogrenciMap, String soyisim) {
        Collection<String> valuesCollection = ogrenciMap.values();
        for (String each : valuesCollection
        ) {
            String[] arr = each.split("-");
            if (arr[1].equalsIgnoreCase(soyisim)) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + "\t\t");

                }
                System.out.println("");
            }
        }

    }

    public static void subeListesiOlusturma(Map<Integer, String> ogrenciMap, String sinif, String sube) {
        Collection<String> valuesCollection = ogrenciMap.values();
        for (String each : valuesCollection
        ) {
            String[] arr = each.split("-");
            if (arr[2].equalsIgnoreCase(sinif)) {
                if (arr[3].equalsIgnoreCase(sube)) {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + "\t\t");
                    }
                }
                System.out.println("");
            }
        }
    }

    public static Map<Integer, String> numaraIleSubeGuncelleme(Map<Integer, String> ogrenciMap, int ogrNo, String yeniSube) {
        String ogrenciValue = ogrenciMap.get(ogrNo);
        String[] arr = ogrenciValue.split("-");
        arr[3] = yeniSube;
        String yeniValue = arr[0] + "-" + arr[1] + "-" + arr[2] + "-" + arr[3] + "-" + arr[4];
        ogrenciMap.put(ogrNo, yeniValue);
        return ogrenciMap;

    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            String entryValue = eachEntry.getValue();
            String[] stringArr = entryValue.split("-");

            if (stringArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(eachEntry.getKey() + " " + stringArr[0] + " " + stringArr[1] + " " + stringArr[4]);
            }
        }
    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            String entryValue = eachEntry.getValue();
            String[] stringArr = entryValue.split("-");
            if (stringArr[4].equalsIgnoreCase(bolum)) {
                System.out.println(eachEntry.getKey() + " " + stringArr[0] + " " + stringArr[1] + " " + stringArr[2]);
            }

        }
    }

    public static Map<Integer, String> soyIsimleriBuyukHarfYapma(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();


        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            String entryValue = eachEntry.getValue();
            String[] stringArr = entryValue.split("-");
            stringArr[1] = stringArr[1].toUpperCase();
            eachEntry.setValue(stringArr[0] + "-" +
                    stringArr[1] + "-" +
                    stringArr[2] + "-" +
                    stringArr[3] + "-" +
                    stringArr[4]);
        }
        return ogrenciMap;
    }


    public static Map<Integer, String> siniflariArttirma(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            String entryValue = eachEntry.getValue();
            String[] stringArr = entryValue.split("-");
            int sinif = Integer.parseInt(stringArr[2]);
            sinif++;
            if (sinif < 12) {
                stringArr[2] = "" + sinif;
            } else stringArr[2] = "MEZUN";
            eachEntry.setValue(stringArr[0] + "-" +
                    stringArr[1] + "-" +
                    stringArr[2] + "-" +
                    stringArr[3] + "-" +
                    stringArr[4]);
        }
        return ogrenciMap;
    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> sinifMapi) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = sinifMapi.entrySet();
        Set<String> siraliOgrenciSeti = new TreeSet<>();


        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySet
             ) {
            String entryValue = eachEntry.getValue();
            String [] entryValueArr = entryValue.split("-");
            String istenenFormattakiBilgi = entryValueArr[2] + " " +
                    entryValueArr[3] + " " +
                    entryValueArr[0] + " " +
                    entryValueArr[1] + " " + eachEntry.getKey();
            siraliOgrenciSeti.add(istenenFormattakiBilgi);
        }
        System.out.println("");
        for (String each:siraliOgrenciSeti
             ) {
            System.out.println(each);
        }
    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> sinifMapi) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = sinifMapi.entrySet();
        Set<String> siraliOgrenciSeti = new TreeSet<>();


        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySet
        ) {
            String entryValue = eachEntry.getValue();
            String [] entryValueArr = entryValue.split("-");
            String istenenFormattakiBilgi = entryValueArr[0] + " " +
                    entryValueArr[1] + " " +
                    entryValueArr[2] + " " +
                    entryValueArr[3] + " " + eachEntry.getKey();
            siraliOgrenciSeti.add(istenenFormattakiBilgi);
        }
        System.out.println("");
        for (String each:siraliOgrenciSeti
        ) {
            System.out.println(each);
        }
    }
    }

