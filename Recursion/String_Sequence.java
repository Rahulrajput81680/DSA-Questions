import java.util.ArrayList;
import java.util.Arrays;

public class String_Sequence{
    public static void getSequence(int arr[],int indx,ArrayList<Integer> tempArr){
        //base condition
        if(indx==arr.length){
            //print the subsequence but do not print empty string
            if(tempArr.size()>0){
                System.out.println(tempArr);
            }
            return;
        }
        //recursion call
        //include
        getSequence(arr, indx+1, tempArr);
        //add the value in temp arr
        tempArr.add(arr[indx]);

        //not include
        getSequence(arr, indx+1, tempArr);
        //remove the value in temp arr
        tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println("for the array"+Arrays.toString(arr));
        getSequence(arr, 0, new ArrayList<>());
    }
}