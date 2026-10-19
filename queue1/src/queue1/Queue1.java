
package queue1;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

   
    public static void main(String[] args) {
       Queue<String> myqueue = new LinkedList<>();

        myqueue.offer("Piolo");
        myqueue.offer("Piolo Joshua");
        myqueue.offer("THE ONE");
        myqueue.offer("YEAH");

        System.out.println(myqueue.peek());

        System.out.println(myqueue.poll());

        System.out.println(myqueue);

        System.out.println(myqueue.size());
    }
}
    
    

