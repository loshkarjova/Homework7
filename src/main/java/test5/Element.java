package test5;

import java.util.Objects;

public class Element {
    private String name;
    private int occurrence;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOccurrence() {
        return occurrence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return occurrence == element.occurrence && name.equals(element.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occurrence);
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    @Override
    public String toString( ) {
        return "{name='" + getName() + '\'' +
               ", occurrence=" + getOccurrence() +
               '}';
    }
}
