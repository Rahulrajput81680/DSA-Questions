import java.util.Scanner;

public class Fibonacci_Series{
    //function definition
    public static int fibonacciFind(int n){
        //base condition
        int result=0;
        if(n<=1){
            return n;
        }else{
            //recursive function call
            result=fibonacciFind(n-1)+fibonacciFind(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find fibonacci series");
        int n=sc.nextInt();
        //function calling
        System.out.println("fibonacci series is: "+fibonacciFind(n));

    }
}