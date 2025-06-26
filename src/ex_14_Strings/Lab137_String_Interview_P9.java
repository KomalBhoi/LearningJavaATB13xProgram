package ex_14_Strings;

public class Lab137_String_Interview_P9 {
    public static void main(String[] args) {
        String s1="Hello";
        String s4="Hello";

        String s2="Hello";
        String s3="Hello";
        String s5="hello";

        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        System.out.println("--------------------");
        //equal(content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
