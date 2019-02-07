package q2;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(23, "rami");
        Person p2 = new Person(23, "rami");
        Person p3 = new Person(20, "rami");
        Person p4 = new Person(23, "eid");
        Person p5 = new Person();
        Person p6 = new Person();

        Employee e1 = new Employee(23, "rami", "eng");
        Employee e2 = new Employee(23, "rami", "business");
        Employee e3 = new Employee(23, "eid", "eng");
        Employee e4 = new Employee(20, "rami", "eng");
        Employee e5 = new Employee(23, "rami", "eng");

        System.out.println("P1 - P1 " + p1.equals(p1));
        System.out.println("P1 - P2 " + p1.equals(p2));
        System.out.println("P1 - P3 " + p1.equals(p3));
        System.out.println("P1 - P4 " + p1.equals(p4));
        System.out.println("P5 - P1 " + p5.equals(p1));
        System.out.println("P1 - P5 " + p1.equals(p5));
        System.out.println("P5 - P6 " + p5.equals(p6));
        System.out.println("P6 - P5 " + p6.equals(p5));

        System.out.println("E1 - E1 " + e1.equals(e1));
        System.out.println("E1 - E2 " + e1.equals(e2));
        System.out.println("E1 - E3 " + e1.equals(e3));
        System.out.println("E1 - E4 " + e1.equals(e4));
        System.out.println("E1 - E5 " + e1.equals(e5));
        System.out.println("E1 - P1 " + e1.equals(p1));
        System.out.println("P1 - E1 " + p1.equals(e1));
    }
}
