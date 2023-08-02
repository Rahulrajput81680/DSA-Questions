import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap_Types{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        //unordered output
        map.put(1,"rahul");
        map.put(2,"rohan");
        map.put(5,"shyam");
        map.put(3,"ankit");
        map.put(8,"ram");

        System.out.println(map);
        //order of insertion is retained in linkedHashMap
        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(1,"rahul");
        map1.put(2,"rohan");
        map1.put(5,"shyam");
        map1.put(3,"ankit");
        map1.put(8,"ram");

        System.out.println("linkedHashMap map looks like"+map1);

        //sorted output on the basis of keys

        TreeMap<Integer,String> map3 = new TreeMap<>();
        map3.put(1,"rahul");
        map3.put(2,"rohan");
        map3.put(5,"shyam");
        map3.put(3,"ankit");
        map3.put(8,"ram");

        System.out.println("TreeMap  map looks like"+map3);

    }
}