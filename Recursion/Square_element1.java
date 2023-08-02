import java.util.Scanner;
//import java.math;
import java.math.BigInteger;

//using optimized approach

public class Square_element1{
    public static BigInteger square(BigInteger a,int b){
        BigInteger result;
        BigInteger finalResult;
        
        if(b==1){
            return a;
        }else{
            result=square(a,b/2);
            finalResult=result.multiply(result);
        }if(b%2==0){
            return finalResult;
        }else{
            return a.multiply(finalResult);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find square");
        BigInteger a = sc.nextBigInteger();
        System.out.println("how many times you want square");
        int b = sc.nextInt();
        BigInteger result=square(a, b);
        System.out.println(result);

    }
}