package q2;

import java.util.Objects;

public class Employee extends Person {
    String role;
    public String getRole() {
        return role;
    }

    public Employee(int age, String name, String role) {
        super();
        this.age = age;
        this.name = name;
        this.role = role;
    }

    /**
     * Compares the current Employee with a second object
     * @param comparable Second object to compare with
     * @return The result of the comparison
     */
    @Override
    public boolean equals(Object comparable) {
        // If it is the same object, then true
        if (this == comparable) {
            return true;
        }

        // If the second object is null or if it's not the same class, then false
        if (comparable == null || getClass() != comparable.getClass()) {
            return false;
        }

        // Comparison of the attributes of the two Employees
        Employee otherEmployee = (Employee) comparable;
        return getAge() == otherEmployee.getAge() &&
                getName().equals(otherEmployee.getName()) &&
                getRole().equals(otherEmployee.getRole());
    }

    /**
     * Generate a custom hashcode based on the age, name and role of an employee
     * @return Custom hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getRole());
    }
}
