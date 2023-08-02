import java.util.Scanner;

public class sum_digits{
    public static int sum(int digit){
        if(digit==0){
            return digit;
        }else{
           return  (digit%10+sum(digit/10));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int digit = sc.nextInt();
        System.out.println("sum of digits are "+sum(digit));

        
    }
}