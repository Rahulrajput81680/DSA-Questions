public class multiply_digits{
    public static void multiply(int num,int k){
        if(k==1){
            System.out.println(num);
            return;
        }else{
            multiply(num,(k-1));
            System.out.println(num*k);
        }
    }
    public static void main(String[] args) {
        int num=12;
        int k=4;
        multiply(num, k);
    }
}