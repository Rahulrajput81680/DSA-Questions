import java.util.Scanner;

public class Tiling_Problem{
    public static int ways(int tiles){
        //base case condition
        if(tiles<=3){
            return tiles;
        }else{
           return  ways(tiles-1)+ways(tiles-2);     }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of tiles");
        int tiles=sc.nextInt();
        System.out.println("total no of ways are "+ways(tiles));
    }
}