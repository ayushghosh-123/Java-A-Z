public class Reverse {
    public static void main(String[] args) {
        String str = "Hello";
        for(int i = str.length() - 1; i >= 0; i--) { // Start from str.length() - 1
            System.out.print(str.charAt(i));    
        }
    }
}

