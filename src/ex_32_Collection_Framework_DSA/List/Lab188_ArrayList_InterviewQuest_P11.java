package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab188_ArrayList_InterviewQuest_P11 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(90);
        marks.add(91);
        marks.add(85);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
