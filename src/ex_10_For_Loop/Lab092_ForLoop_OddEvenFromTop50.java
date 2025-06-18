package ex_10_For_Loop;

public class Lab092_ForLoop_OddEvenFromTop50 {
    public static void main(String[] args) {
        //  Find the even numbers from 1 to 50.
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("Even no -> " +i);
            }
        }
    }
}
