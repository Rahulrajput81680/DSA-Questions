import java.util.HashMap;
import java.util.Scanner;

public class duplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        boolean duplicate=false;

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                boolean dupliate=true;
                System.out.println("yes");
                break;
            }else{
                 map.put(arr[i],1);
            }
           
            
        }
        if(duplicate==false){
            System.out.println("no");
        }
    }
}