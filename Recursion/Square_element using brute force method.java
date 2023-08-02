import java.util.Scanner;

public class Square_element{
    public static int square(int a,int b){
        int result=0;
        if(b==1){
            return a;
        }
        else{
            result=a*square(a,b-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find square value");
        int a=sc.nextInt();
        System.out.println("how many times you want to square");
        int b=sc.nextInt();
        System.out.println(square(a, b));

    }
}