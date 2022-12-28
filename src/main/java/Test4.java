import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<String> list = List.of("bird", "bird", "bird", "fox","fox", "fox", "cat","cat","bird","fox");
        calcOccurance(list);

    }

    public static void calcOccurance(List<String> strings) {
        List<String> temp = new ArrayList<>();
        for (String s : strings) {
            if (!temp.contains(s)) {
                int frequency = Collections.frequency(strings, s);
                System.out.println(s + ": " + frequency);
            }
            temp.add(s);


        }

    }
}
