import java.util.Scanner;

public class Alternate_Sum{
    public static int sum(int num){
        if(num==0){
            return 0;
        }if(num%2==0){
            return sum(num-1)-num;
        }else{
            return sum(num-1)+num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int result = sum(num);
        System.out.println("alternate sign sum is:"+result);

    }
}