import java.util.Arrays;

public class selection_sort{
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_indx = i;
            for(int j=i+1;j<arr.length;i++){
                if(arr[j]<arr[min_indx]){
                    min_indx=j;
                }
            }
            if(min_indx!=i){
                //swap between arr[min_indx] and arr[i]
                int temp=arr[min_indx];
                arr[min_indx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,45,47,85,1,25,44};
        selectionSort(arr);
        System.out.println("sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}