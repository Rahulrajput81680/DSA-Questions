import java.util.HashMap;
import java.util.Map;

public class Functions{
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        //functionality of put() function
        hashmap.put(1, "Rahul");
        hashmap.put(5,"shyam");
        hashmap.put(8, "rohan");

        System.out.println(hashmap);
        //functionality of get function
        String result=hashmap.get(1);
        System.out.println(result);

        //functionality of remove function
        hashmap.remove(5);
        System.out.println("updated hashmap is:"+hashmap);

        //functionality of containsKey() function
        System.out.println(hashmap.containsKey(1));

        //iterating for loop
        for(Map.Entry<Integer,String> e:hashmap.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        
    }
}