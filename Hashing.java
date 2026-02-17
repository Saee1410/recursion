import java.util.*;

public class Hashing {
    public static void main(String[] args) {
       HashMap<String, Integer> map = new HashMap<>();

       //Insersion
       map.put("India", 120);
       map.put("China", 110);       
       System.out.println(map);

       map.put("China", 180);
         System.out.println(map);

         if(map.containsKey("Chaina")) {
            System.out.println("Key is present in the map");
         } else {
            System.out.println("Key is not present in the map");    
         }

         System.out.println(map.get("China"));
         System.out.println(map.get("shreelanka"));

        //  int arr[] = {1, 2, 3, 4, 5};
        //  for(int val : arr) {
        //     System.out.println(val);
        //  }

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        //REMOVE 
        map.remove("China");
        System.out.println(map);
    }

    
}
