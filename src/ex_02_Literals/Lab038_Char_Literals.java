package ex_02_Literals;

public class Lab038_Char_Literals {
    public static void main(String[] args) {
        char c1='A'; // A to Z, a-z, !@#$%^&*()_+
        char c2='B';
        char c3='@';
        char c4='_';
        char c5='9';
        char c6='1';
        char c7='(';

        //Escape Char
        char new_line ='\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("KomalBhoi");
        System.out.println("Komal"+new_line+"Bhoi");
        System.out.println("Komal"+tab_line+"Bhoi");
        System.out.println("Komal"+back_space+"Bhoi");
        System.out.println("Komal"+carriage_return+"Bhoi");
    }
}
