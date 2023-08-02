public class BinarySearch_in_2D{
    public static boolean BinarySearch(int matrix[][],int target){
        //number of rows
        int m=matrix.length;
        if(m==0){
            return false;
        }
        //number of columns
        int n=matrix[0].length;
        //binary search implementation
        int low=0,high=m*n-1;
        int midIndx,midElement,rowIndx,colIndx;

        while(low<=high){
            midIndx=low+(high-low)/2;
            rowIndx=midIndx/n;
            colIndx=midIndx%n;
            midElement=matrix[rowIndx][colIndx];

            if(target==midElement){
                return true;

            }else if(target<midElement){
                high=midIndx-1;
            }else{
                low=midIndx+1;
            }

        }
        return false;

    }
        
    public static void main(String[] args) {
        int matrix[][]={
            {2,5,4,6},
            {7,8,9,10},
            {11,12,13,14}

        };
        int target=15;
        //BinarySearch(matrix,target);
        System.out.println(BinarySearch(matrix, target));
    }
}