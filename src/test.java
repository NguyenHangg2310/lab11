import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[]array = new String[5];
        for (int i = 0; i < array.length - 2; i++) {
            array[i] = "01";
        }
        System.out.println(Arrays.toString(array));
    }

//    public boolean check (ArrayList array, int position) {
//        if (array[position + 1] == null) {
//            return true;
//        }
//    }
}
