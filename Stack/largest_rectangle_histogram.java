public class largest_rectangle_histogram{
    public static int are(int arr[]){
        for(int i=1;i<arr.length;i++){
            //previous smaller
            if(arr[i]>arr[i-1]){
                return arr[i-1];
            }else {
                return arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,5,6,3,2,4,2};

    }
}