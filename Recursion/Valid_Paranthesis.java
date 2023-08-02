public class Valid_Paranthesis{
    public static void paranthesis(int n, int oc, int cc, String ans){
        //oc = open count
        //cc = close count
        if(oc==n && cc==n){
            System.out.println(ans);
            return;
        }if(oc<n){
            paranthesis(n, oc+1, cc, ans+'(');
        }if(cc<oc){
            paranthesis(n, oc, cc+1, ans+')');
        }
    }
    public static void main(String[] args) {
       paranthesis(3, 0, 0, "");
        
    }
}