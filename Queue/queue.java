import java.util.LinkedList;
import java.util.Queue;

public class queue{
    public static void main(String[] args) {
        //adding elements using enqueue
        Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<10;i++){
                q.add(i);
            }
            System.out.println("queue data looks like "+q);

            //removing an element from queue
            System.out.println("before removing top most element is :"+q.peek());
            q.remove();
            System.out.println("efter removing top most element is: "+q.peek());

            System.out.println("queue total size is: "+q.size());



        
    }
}