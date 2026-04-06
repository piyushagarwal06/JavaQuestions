package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq= new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.addLast(3);
        dq.add(4);
        dq.addFirst(44);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

    }
}
