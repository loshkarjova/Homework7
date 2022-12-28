import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 1, 2, 1, 2, 5);
        List<Integer> unique = findUnique(list);
        System.out.println(unique);

    }

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>();
        int counter = 0;
        for (Integer i : list) {
            for (Integer j : list) {
                if (i.equals(j)) {
                    counter++;
                }
            }
            if (counter == 1) {
                list2.add(i);
            }
            counter=0;
        }
        return list2;


    }


}

