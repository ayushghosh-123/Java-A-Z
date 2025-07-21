public class Concatinate {
    public static void main(String[] args) {
        // concationation
        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1 + " " + str2;
        System.out.println(str3.length());

        // char at
        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i));

        }
    }
}
