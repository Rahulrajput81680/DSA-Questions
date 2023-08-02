import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
//sorting using map based on keys
public class sorted_order{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of key pairs");
        int n = sc.nextInt();
        TreeMap<Integer,String> map = new TreeMap<>();
         System.out.println("enter the key value pairs: ");
        for(int i=0;i<n;i++){
           
            int key=sc.nextInt();
            String value = sc.next();
            map.put(key, value);

        }
        System.out.println("the map is: "+map);
    }
}