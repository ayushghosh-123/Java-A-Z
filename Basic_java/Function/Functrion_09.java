import java.util.Arrays;

public class Functrion_09 {
    public static void main(String[] args) {
        int [] Arr = {1,2, 3,4,6,8};
        change(Arr);
        System.out.println(Arrays.toString(Arr));
    }

    public static void change (int [] num){
        num [0] = 99;
    }
}
