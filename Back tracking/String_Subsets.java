public class String_Subsets{
    public static void subsets(String str,String ans,int indx){
        //base condition
        if(indx==str.length()){
            System.out.println(ans);
            return;
        }
        //recusrdion
        //yes choice
        subsets(str, ans+str.charAt(indx), indx+1);
        //no choice
        subsets(str, ans, indx+1);
    }
    public static void main(String[] args) {
        String str="abc";
        subsets(str, "", 0);
    }
}