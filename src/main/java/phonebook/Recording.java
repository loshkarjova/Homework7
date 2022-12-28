package phonebook;

import java.util.List;

public class Recording {
    private String name;
    private List<String> numbers;

    public Recording(String name, List<String> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\'' +
               ", numbers: " + numbers +
               '}';
    }
}
