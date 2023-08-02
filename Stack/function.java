import java.util.Stack;

public class function{
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        // push operation

        stack1.push(5);
        stack1.push(4);
        stack1.push(2);
        stack1.push(8);

        //peek() is used to return stack top most element

        System.out.println("stack top most element is: "+stack1.peek());

        //delete the top most element from the stack
        stack1.pop();
        System.out.println("after removing top most element: "+stack1);
        System.out.println("after deletion top most element is: "+stack1.peek());

        //searching an element in the stack
        System.out.println("the value 2 is at "+stack1.search(2));
        System.out.println("the value 5 is at "+stack1.search(5));

        //search function returns -1 when the element is not present
        System.out.println("the value 2 is at "+stack1.search(9));

        //cheack whether stack is empty or not
        System.out.println("checks wheteher the stack is empty or not: "+stack1.empty()); 

    }
}