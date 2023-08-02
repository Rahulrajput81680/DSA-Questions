public class factorial{
    public static void fact(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        fact(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        //System.out.println(fact(n));
        fact(n);
    }
}