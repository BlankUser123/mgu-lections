public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student firstStudent = new Student(1, "John");
        Student secondStudent = new Student(2, "Michael", 20);

        firstStudent.display();
        secondStudent.display();
    }
}
