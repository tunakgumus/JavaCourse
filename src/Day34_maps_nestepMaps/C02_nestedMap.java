package Day34_maps_nestepMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class C02_nestedMap {
    public static void main(String[] args) {
        /*
        "firstname" : "Ahmet",
        "lastname" : "Bulut",
        "totalprice" : 500,
        "depositpaid" : false,
        "bookingdates" : {
        "checkin" : "2021-06-01",
        "checkout" : "2021-06-10"
          },
"additionalneeds" : "wi-fi" }
         */
        Map<Integer,Map<String,Object>> otelMapi = new HashMap<>();

        Map<String,String> bookingMapi = new LinkedHashMap<>();
        bookingMapi.put("checkin" , "2021-06-01");
        bookingMapi.put("checkout","2021-06-10");

        Map<String, Object> musteriMapi = new HashMap<>();
        musteriMapi.put("firstname" , "Ahmet");
        musteriMapi.put("lastname","Bulut");
        musteriMapi.put("totalprice",500);
        musteriMapi.put("depositpaid",false);
        musteriMapi.put("booking dates",bookingMapi);
        musteriMapi.put("additionalneeds","wi-fi");

        otelMapi.put(101,musteriMapi);
        System.out.println(otelMapi);

        System.out.println(musteriMapi.get("lastname"));

        System.out.println(musteriMapi.get("totalprice"));

        System.out.println(((Map)musteriMapi.get("booking dates")).get("checkin"));

        System.out.println(((Map) musteriMapi.get("booking dates")).get("checkout"));
    }
}
