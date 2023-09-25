public class Student {
    private int id;
    private String name;
    private int age;

    private Student(int id) {
        this.id = id;
    }

    private Student(int id, String name) {
        this(id);
        this.name = name;
    }

    private Student(int id, String name, int age) {
        this(id, name);
        this.age = age;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student first = new Student(1);
        Student second = new Student(2, "John");
        Student third = new Student(3, "Michael", 20);

        first.display();
        second.display();
        third.display();
    }
}
