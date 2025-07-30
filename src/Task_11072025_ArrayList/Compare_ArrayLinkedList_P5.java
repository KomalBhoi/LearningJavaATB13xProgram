package Task_11072025_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Compare_ArrayLinkedList_P5 {
    public static void main(String[] args) {


    ArrayList<Integer> arrLstTime = new ArrayList<>();
        System.out.println("-----------ArrayList Time--------------");
        Long startTime = System.currentTimeMillis();
        System.out.println("Start Time:"+startTime);
        for(int i=0;i<=100000;i++){
            arrLstTime.add(i);
        }

//        for(int i:arrLstTime){
//            System.out.println(i);
//        }

        Long endTime = System.currentTimeMillis();
        System.out.println("End Time:" +endTime);
        System.out.println("Time taken with ArrayList:" +(startTime - endTime));

        System.out.println("-----------LinkedList Time--------------");

        Long lstStartTime = System.currentTimeMillis();
        System.out.println("Start Time: " +lstStartTime);
        LinkedList<Integer> lstList=new LinkedList<>();

        for(int i=0;i<=100000;i++){
            lstList.add(i);
        }

//        for(int lst:lstList){
//            System.out.println(lst);
//        }

        Long lstEndTime = System.currentTimeMillis();
        System.out.println("End Time: " + lstEndTime);
        System.out.println("Time taken with LinkedList: " +(lstStartTime - lstEndTime));
    }
}
