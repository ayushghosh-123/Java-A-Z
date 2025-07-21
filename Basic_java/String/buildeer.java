import java.util.*;

public class buildeer {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        // character at index 0
        System.out.println(str.charAt(0));

        // set character index
        str.setCharAt(0, 'P');
        System.out.println(str);

        str.insert(5, 'w');
        System.out.println(str);

        // delete the extra string
        str.delete(2, 4);
        System.out.println(str);

        str.append("w");
        str.append("o");
        str.append("l");
        str.append("l");
        System.out.println(str);

        // length funfction
        System.out.println(str.length());


    }
}