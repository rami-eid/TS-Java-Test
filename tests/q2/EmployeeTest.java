package q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Person p1 = new Person(23, "rami");
    private Person p2 = new Person(20, "rami");
    private Employee e1 = new Employee(23, "rami", "eng");
    private Employee e2 = new Employee(23, "rami", "eng");
    private Employee e3 = new Employee(23, "rami", "business");
    private Employee e4 = new Employee(23, "eid", "eng");
    private Employee e5 = new Employee(20, "rami", "eng");

    @Test
    void equals() {
        assertTrue(e1.equals(e1), "Two instances of the same Employee should be equal");
        assertTrue(e1.equals(e2), "Two instances of Employee with the same age, name and role should be equal");
        assertFalse(e1.equals(e3), "Two instances of Employee with the same age, name, but different roles should not be equal");
        assertFalse(e1.equals(e4), "Two instances of Employee with the same age, role but different names should not be equal");
        assertFalse(e1.equals(e5), "Two instances of Employee with the same name, role but different ages should not be equal");
        assertFalse(e1.equals(p1), "An instance of Employee should not be equal to an instance of Person, even with the different attributes.");
        assertFalse(e1.equals(p2), "An instance of Employee should not be equal to an instance of Person, even with the different attributes.");
    }

}