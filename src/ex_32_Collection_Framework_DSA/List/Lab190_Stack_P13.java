package ex_32_Collection_Framework_DSA.List;

import java.util.Stack;

public class Lab190_Stack_P13 {
    public static void main(String[] args) {
        Stack s1= new Stack();
        s1.add("Python");
        s1.add("c#");
        s1.add("Java");
        s1.add("C++");

        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1);

        // Create Integer type stack
        Stack<Integer> intStack=new Stack<>();

        // Create String type stack
        Stack<String> stringStack = new Stack<>();

        intStack.push(23);
        intStack.push(43);
        intStack.push(56);
        System.out.println(intStack);
    }
}
