package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recording recording1 = new Recording("Kate", List.of("555-55-5", "666-66-6"));
        PhoneDirectory phoneDirectories = new PhoneDirectory();

        phoneDirectories.add(recording1);
        String record = phoneDirectories.find(recording1);
        List<String> all = phoneDirectories.findAll(recording1);
        System.out.println("Name: "+recording1.getName()+ ", basic number: " + record);
        System.out.println("All numbers: " + all);



    }
}
