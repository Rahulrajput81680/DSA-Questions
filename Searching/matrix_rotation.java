import java.util.Arrays;

public class matrix_rotation{
    public static void rotatedMatrix(int[][] arr){
        int m = arr.length;
        int n = arr.length;

        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                //transpose of 2D array
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //swap the elemen of left and right side elements
        for(int i=0;i<m;i++){
            int li=0;
            int ri=n-1;

            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        rotatedMatrix(arr);
        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}