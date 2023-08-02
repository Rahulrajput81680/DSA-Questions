import java.util.Scanner;

public class sum_natural_number{
    public static int sum(int num){
        int result=0;
        //int finalresult=0;
        if(num==0){
            return num;
        }else{
            result=num+sum(num-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println(sum(num));
    }
}