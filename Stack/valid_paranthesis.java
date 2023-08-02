import java.util.Scanner;
import java.util.Stack;

public class valid_paranthesis{
    public static int isValid(String str){

        char[] ch = str.toCharArray();
        Stack<Character> stack1 = new Stack<>();

        for(char i=0;i<ch.length;i++){
            if(i=='(' || i=='{'||i=='['){
                stack1.push(i);
                continue;
            }
            else if(stack1.empty()){
                return false;    
            }
            char top = stack1.pop();
            if(top=='(' && i!=')'){
                return false;
            }else if(top=='[' && i!=']'){
                return false;
            }else if(top=='{' || i!='}'){
                return false;
            }
        }
        stack1.empty();
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        
    }
}