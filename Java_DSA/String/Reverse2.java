public class Reverse2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        for(int i=0; i<str.length()/2; i++) {
            int front = i;
            int back = str.length()-1-i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }

        System.out.println(str);
    }
}
