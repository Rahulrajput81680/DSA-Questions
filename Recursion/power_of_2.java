import java.util.Scanner;

public class power_of_2{
    public static boolean power(int num){
        if(num==1){
            return true;
        }else if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println(power(num));
    }
}