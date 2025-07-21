package ex_32_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

public class Lab193_Queue_P1 {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation

        PriorityQueue q = new PriorityQueue();
        q.add("Komal");
        q.add("Bhoi");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
    }
}
