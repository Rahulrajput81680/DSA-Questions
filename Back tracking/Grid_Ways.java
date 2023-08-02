public class Grid_Ways{
    public static int ways(int i,int j, int n, int m){
        //base condition
    if(i==n-1 && j==m-1){
        return 1;
    }else if(i==n || j==n){  //boundry cross condition
        return 0;
    }  
    //recursion
    int w1=ways(i+1, j, n, m);
    int w2=ways(i, j+1, n, m);
    return w1+w2;
    }
    
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(ways(0, 0, n, m));
    }
}