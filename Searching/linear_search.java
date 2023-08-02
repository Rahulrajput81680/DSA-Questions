import java.util.Scanner;

public class linear_search{
    public static void main(String[] args) {
        int arr[]={5,4,7,8,3,2,1};
        int m=1;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==m){
                System.out.println("array found at index" +" "+i);
                break;
            }
        }
        //System.out.println("no element found");

        }
    
}