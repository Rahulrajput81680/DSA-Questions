import java.util.Scanner;

public class Staircase_problem{
    public static int ways(int n){
        int result=0;
        if(n<=1){
            return n;
        }else{
            result=ways(n-1)+ways(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("total no of ways are"+" " +ways(n+1));
    }
}