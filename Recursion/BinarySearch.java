import java.util.Scanner;

public class BinarySearch{
    public static int binarysearch(int arr[],int target,int low,int high){

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                return binarysearch(arr, target, mid+1, high);
            }else{
                return binarysearch(arr, target, low, mid-1);
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={2,4,6,8,10,12};
        System.out.println("enter the target element");
        int target=sc.nextInt();
        System.out.println(binarysearch(arr, target, 0, arr.length-1));
        
    }
}