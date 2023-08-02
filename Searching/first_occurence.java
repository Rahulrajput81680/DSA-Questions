public class first_occurence{
    public static int  occurence(int arr[],int low,int high,int mid,int target){
          for(int i=0;i<high;i++){
            if(mid==target){
                return mid;
            }else if(mid<target){
                return low=mid+1;
            }else{
                return high=mid-1;
            }
            
        }
       return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,12,14};
        int target=6;
        int low=0;
        int high=arr.length;
        int mid=(low+high)/2;
        System.out.println(occurence(arr, low, high, mid, target));

      

    }
}