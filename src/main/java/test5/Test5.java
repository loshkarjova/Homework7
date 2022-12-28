package test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test5 {


    public static void main(String[] args) {
        Element bird = new Element("bird");

        Element fox = new Element("fox");

        Element cat = new Element("cat");

        List<Element> list = List.of(bird, bird, bird, fox, fox, cat,bird,fox,cat,bird);
        bird.setOccurrence(findOccurance(list, bird));
        fox.setOccurrence(findOccurance(list,fox));
        cat.setOccurrence(findOccurance(list,cat));

        String s = bird.toString();
        String s1 = fox.toString();
        String s2 = cat.toString();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);


    }

    public static int findOccurance(List<Element> list, Element element) {
        return Collections.frequency(list, element);
    }


}
