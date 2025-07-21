package ex_32_Collection_Framework_DSA.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab194_LinkedList_P2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(10);
        queue.add(8);
        queue.add(5);

        Iterator<Integer> iterator =queue.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
