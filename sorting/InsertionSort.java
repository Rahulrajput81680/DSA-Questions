import java.util.Arrays;

public class InsertionSort{
    //implementatiuon of insertion sort
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){
                // swap beetween j and j-1;
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,85,10,12,54,45,78};
        //function calling
        insertionSort(arr);
        System.out.println("sorted array is: ");
        System.out.println(Arrays.toString(arr));

    }
}