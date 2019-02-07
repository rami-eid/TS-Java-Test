package q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person p1 = new Person(23, "rami");
    private Person p2 = new Person(23, "rami");
    private Person p3 = new Person(20, "rami");
    private Person p4 = new Person(23, "eid");
    private Person p5 = new Person();
    private Person p6 = new Person();
    private Employee e1 = new Employee(23, "rami", "eng");
    private Employee e2 = new Employee(23, "rami", "business");

    @Test
    void equals() {
        assertTrue(p1.equals(p1), "Two instances of the same Person should be equal");
        assertTrue(p1.equals(p2), "Two instances of Person with the same age and name should be equal");
        assertFalse(p1.equals(p3), "Two instances of Person with the same name, but different ages should not be equal");
        assertFalse(p1.equals(p4), "Two instances of Person with the same age, but different names should not be equal");
        assertFalse(p1.equals(p5), "An instance of Person with blank attributes is not equal to another person");
        assertFalse(p5.equals(p1), "An instance of Person with blank attributes is not equal to another person");
        assertFalse(p5.equals(p6), "Two instances of Person with blank attributes are not equal");
        assertFalse(p1.equals(e1), "An instance of Person should not be equal to an instance of Employee, even with the same attributes.");
        assertFalse(p1.equals(e2), "An instance of Person should not be equal to an instance of Employee, even with the different attributes.");
    }
}