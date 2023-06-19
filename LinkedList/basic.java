package LinkedList;
import java.util.LinkedList;

public class basic {
    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<>();

        //adding new points
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        print(ll);  
        ll.addFirst(0);
        ll.addLast(101);
        print(ll);
        //adding at index 2
        ll.add(2, 22);
        print(ll);

        //removing elements
        ll.remove(0);
        ll.remove(1);
        ll.remove(3);



    }

    public static void print(LinkedList list)
    {
        System.out.println("The resultant output is " + list);
    }
}
