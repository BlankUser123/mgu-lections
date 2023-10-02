public class Student {
    private int id;
    private String name;
    static String college = "ITS";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

class TestApplication {
    public static void main(String[] args) {
        Student first = new Student(111, "Karan");
        Student second = new Student(222, "Aryan");

        Student.college = "BBDIT";

        first.display();
        second.display();
    }
}
