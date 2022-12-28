import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> integers = toList(new Integer[]{1, 2, 3});
        System.out.println(integers);

    }

    public static List<Integer> toList(Integer [] array ){
        return Arrays.asList(array);

    }
}
