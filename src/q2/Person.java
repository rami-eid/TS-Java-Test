package q2;

import java.util.Objects;

public class Person {
    int age;
    public int getAge() {
        return age;
    }

    String name;
    public String getName() {
        return name;
    }

    // Default constructor
    public Person() {
        this.age = -1;
        this.name = "";
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Compares the current Person with a second object
     * @param comparable Second object to compare with
     * @return The result of the comparison
     */
    @Override
    public boolean equals(Object comparable) {
        // If it is the same object, then True
        if (this == comparable) {
            return true;
        }

        // If the second object is null or not the same type, then False
        if (comparable == null || getClass() != comparable.getClass()) {
            return false;
        }

        // Comparisons of the attributes of two Person
        Person otherPerson = (Person) comparable;
        return getAge() >= 0 &&
                otherPerson.getAge() >= 0 &&
                !getName().isEmpty() &&
                !otherPerson.getName().isEmpty() &&
                getAge() == otherPerson.getAge() &&
                getName().equals(otherPerson.getName());
    }

    /**
     * Generate a custom hashcode based on the age and name of a person
     * @return Custom hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }
}
