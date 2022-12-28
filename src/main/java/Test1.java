import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","d","a","b","c","d","a","b","c","d","a");

        int occurance = countOccurance(list, "a");
        System.out.println(occurance);


    }

    public static int countOccurance(List<String> a, String string) {

        int counter = 0;
        for (String s: a) {
            if (s.equals(string)) {
                counter++;
            }
        }
        return counter;
    }
}
