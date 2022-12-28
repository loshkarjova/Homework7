package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    private List<Recording> recordings = new ArrayList<>();

    public void add(Recording rec) {
        recordings.add(rec);
    }

    public String find(Recording rec) {
        if (recordings.contains(rec)) {

            Recording recording = recordings.get(recordings.indexOf(rec));
            return recording.getNumbers().get(0);
        } else return null;

    }

    public List<String> findAll(Recording rec) {
        for (Recording recording : recordings) {
            if (recording.getName().equals(rec.getName())) {
                return recording.getNumbers();
            }
        }
        return null;
    }


}
