package ex_14_Strings;

public class Lab134_String_Functions_P6 {
    public static void main(String[] args) {
        String str ="Hello";
        String str1 ="hello";
        System.out.println(str.length()); // Returns the length of the string
        System.out.println(str.charAt(1));// Returns the character at the specified index
        System.out.println(str.substring(4));
        System.out.println(str.substring(0,5));
        System.out.println(str.equals(str1)); // Compares two strings (case-sensitive)
        System.out.println(str.equalsIgnoreCase(str1)); //
        System.out.println(str.compareTo(str1)); // Lexicographically compares two strings
        System.out.println(str.contains("l"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim()); // Removes leading and trailing whitespace
        System.out.println(str.replace("H","G"));
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.startsWith("He"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        String result = String.join("/","2025","06","25");
        System.out.println(result);
    }
}
